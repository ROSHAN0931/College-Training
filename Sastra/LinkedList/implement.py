class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insertFront(self,data):
        newnode = Node(data)
        newnode.next = self.head
        self.head = newnode

    def display(self):
        temp = self.head
        while temp:
            print(temp.data,end="->")
            temp = temp.next
        print("Null")

l1 = LinkedList()

l1.insertFront(1)
l1.insertFront(2)
l1.insertFront(3)
l1.insertFront(4)
l1.display()