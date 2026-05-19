class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class Linkedlist:
    def __init__(self):
        self.head = None

    def insertend(self,data):
        newnode = Node(data)

        if self.head is None:
            self.head = newnode
            return

        temp = self.head
        while temp.next:
            temp = temp.next

        temp.next = newnode

    def intersection(self,other):
        temp1 = self.head
        temp2 = other.head

        result = []
        while temp1 and temp2:
            if temp1.data == temp2.data:
                result.append(temp1.data)
                temp1 = temp1.next
                temp2 = temp2.next

            elif temp1.data < temp2.data:
                temp1 = temp1.next

            else:
                temp2 = temp2.next

        if result:
            print(*result)
        else:
            print("No Intersection")

n1 = int(input())
val1 = list(map(int,input().split()))

n2 = int(input())
val2 = list(map(int,input().split()))

l1 = Linkedlist()
l2 = Linkedlist()

for i in val1:
    l1.insertend(i)

for i in val2:
    l2.insertend(i)

l1.intersection(l2)
