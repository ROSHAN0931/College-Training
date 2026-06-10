class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LLT21:
    def __init__(self):
        self.head = None

    def insertback(self,data):
        newnode = Node(data)
        if self.head is None:
            self.head = newnode
            return

        temp = self.head
        while temp.next:
            temp = temp.next

        temp.next = newnode

    def delpos(self,pos):
        if self.head is None:
            print("List is empty")
            return

        if pos==1:
            self.head = self.head.next
            return

        temp = self.head
        for i in range(1,pos-1):
            temp = temp.next

        temp.next = temp.next.next

    def display(self):
        temp = self.head
        while temp:
            print(temp.data,end=" ")
            temp = temp.next

ll = LLT21()
n = int(input())
if n==0:
    print("List is empty")
else:
    nums = list(map(int,input().split()))
    for i in nums:
        ll.insertback(i)

    pos = int(input())
    if pos > n:
        print("Position out of range")
    else:
        ll.delpos(pos)
        ll.display()