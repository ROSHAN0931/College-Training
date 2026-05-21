class Node:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None

def buildtree(arr):
    if not arr or arr[0]=="null":
        return None

    nodes = []

    # create nodes
    for x in arr:
        if x == "null":
            nodes.append(None)
        else:
            nodes.append(Node(int(x)))

    for i in range(len(arr)):
        if nodes[i] is not None:
            left = 2 * i + 1
            right = 2 * i + 2

            if left < len(arr):
                nodes[i].left = nodes[left]

            if right < len(arr):
                nodes[i].right = nodes[right]

    return nodes[0]

def solve(root,num):
    if root is None:
        return 0

    num = num * 10 + root.data

    # leaf node
    if root.left is None and root.right is None:
        return num

    return solve(root.left,num) + solve(root.right,num)

n = int(input())
arr = input().split()
root = buildtree(arr)
print(solve(root,0))