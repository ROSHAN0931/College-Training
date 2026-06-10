from selenium.webdriver.common.devtools.v140.extensions import load_unpacked
from selenium.webdriver.support.expected_conditions import new_window_is_opened


class Node:
    def __init__(self,data): #constructor
        self.data = data
        self.next = None

class Linkedlist:
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

    def insertfront(self,data):
        newnode = Node(data)
        if self.head is None:
            self.head = newnode
            return

        newnode.next = self.head
        self.head = newnode

    def insertmiddle(self,data,pos):
        newnode = Node(data)

        if pos==1:
            newnode.next = self.head
            self.head = newnode
            return

        temp = self.head
        for i in range(1,pos-1):
            temp = temp.next

        newnode.next = temp.next
        temp.next = newnode

    def deleteback(self):
        if self.head is None:
            return

        if self.head.next is None:
            self.head = None
            return

        temp = self.head
        while temp.next.next:
            temp = temp.next

        temp.next = None

    def deletefront(self):
        if self.head is None:
            return
        self.head = self.head.next

    def delpos(self,pos):
        if self.head is None:
            return

        if pos == 1:
            self.head = self.head.next
            return

        temp = self.head
        for i in range(1,pos-1):
            temp = temp.next

        temp.next = temp.next.next

    def display(self):
        temp = self.head
        while temp:
            print(temp.data,end="->")
            temp = temp.next
        print("None")


list = Linkedlist()
list.insertback(10)
list.insertback(20)
list.insertback(30)
list.display()
list.insertfront(45)
list.display()
list.insertmiddle(99,3)
list.display()
list.deleteback()
list.deleteback()
list.display()
# list.deletefront()
# list.display()
list.delpos(3)
list.display()