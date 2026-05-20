class Stack:
    def __init__(self):
        self.items = []

    def push(self, value):
        self.items.append(value)

    def pop(self):
        return self.items.pop()

    def isempty(self):
        return len(self.items) == 0


def redundant(exp):
    stack = Stack()

    for ch in exp:

        # If closing bracket comes
        if ch == ')':

            top = stack.pop()

            operator = False

            # Check contents inside ()
            while top != '(':

                if top in ['+', '-', '*', '/']:
                    operator = True

                top = stack.pop()

            # No operator means redundant brackets
            if operator == False:
                return "Yes"

        else:
            stack.push(ch)

    return "No"


n = int(input())

for i in range(n):
    exp = input()

    print(redundant(exp))