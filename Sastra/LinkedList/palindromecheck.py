
class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class LinkedList():
    def __init__(self):
        self.head = None

    def insertend(self,data):
        newnode = Node(data)

        # If list is empty
        if self.head is None:
            self.head = newnode
            return

        temp = self.head
        while temp.next:
            temp=temp.next

        temp.next = newnode

    def ispalindrome(self):
        arr = []
        temp = self.head
        while temp:
            arr.append(temp.data)
            temp = temp.next

        if arr == arr[::-1]:
            return "Yes"
        else:
            return "No"


n = int(input())

values = list(map(int,input().split()))

l1 = LinkedList()

for i in values:
    l1.insertend(i)

print(l1.ispalindrome())