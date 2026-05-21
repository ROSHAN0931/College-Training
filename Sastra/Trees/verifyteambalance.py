class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


def buildTree(arr):
    nodes = []

    for x in arr:
        nodes.append(Node(x))

    for i in range(len(arr)):

        left = 2 * i + 1
        right = 2 * i + 2

        if left < len(arr):
            nodes[i].left = nodes[left]

        if right < len(arr):
            nodes[i].right = nodes[right]

    return nodes[0]


def sumTree(root):

    if root is None:
        return 0

    return root.data + sumTree(root.left) + sumTree(root.right)


def check(root):

    # empty or leaf node
    if root is None or (root.left is None and root.right is None):
        return True

    left_sum = sumTree(root.left)
    right_sum = sumTree(root.right)

    if root.data == left_sum + right_sum:
        return check(root.left) and check(root.right)

    return False


n = int(input())
arr = list(map(int, input().split()))

root = buildTree(arr)

if check(root):
    print("Yes")
else:
    print("No")