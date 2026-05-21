class Node:
    def __init__(self,data):
        self.data = data
        self.left = None
        self.right = None

def insert(root,data):
    if root is None:
        return Node(data)

    if data < root.data:
        root.left = insert(root.left,data)
    else:
        root.right = insert(root.right,data)

    return root

def inorder(root):
    if root:
        inorder(root.left)
        print(root.data,end=" ")
        inorder(root.right)

root = None
values = [ 50,30,20,43,10,23,55,96,52 ]
for i in values:
    root = insert(root,i)
inorder(root)