from pip._internal.utils import temp_dir


class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LLT2:
    def __init__(self):
        self.head = None

    def insert(self,data):
        newnode = Node(data)
        if self.head is None:
            self.head = newnode
            return

        temp = self.head
        while temp.next:
            temp = temp.next

        temp.next = newnode

    def delete(self):
        if self.head is None:
            return

        if self.head.next is None:
            self.head = None
            return

        temp = self.head
        while temp.next.next:
            temp = temp.next

        temp.next = None

    def display(self):
        if self.head is None:
            print("List is empty")
            return

        temp = self.head
        while temp:
            print(temp.data,end=" ")
            temp = temp.next

ll = LLT2()
n = int(input())
nums = list(map(int,input().split()))
for i in nums:
    ll.insert(i)

deletetask = int(input())
for i in range(1,deletetask+1):
    ll.delete()

ll.display()