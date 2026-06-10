class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedListProduct:
    def __init__(self):
        self.head = None

    def insert(self,data):
        newnode = Node(data)
        if self.head is None:
            self.head = newnode
            return

        newnode.next = self.head
        self.head = newnode

    def display(self):
        temp = self.head
        while temp:
            print(temp.data,end=" ")
            temp = temp.next

ll = LinkedListProduct()
n = int(input())
nums = list(map(int,input().split()))
for i in nums:
    ll.insert(i)

ll.display()