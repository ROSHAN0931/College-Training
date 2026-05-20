

class Stack:
    def __init__(self):
        self.stack = []

    def push(self,data):
        self.stack.append(data)

    def pop(self):
        return self.stack.pop()

    def top(self):
        return self.stack[-1]

    def isEmpty(self):
        return len(self.stack) == 0

    def dailytemp(self,temperatures):
        n = len(temperatures) # 8
        answer = [0] * n

        for i in range(n):
            while (not self.isEmpty() and
            temperatures[i] > temperatures[self.top()]):
                index = self.pop()
                answer[index] = i - index

            self.push(i)
        return answer

# array size
n = int(input())
# array elements
temperatures = list(map(int,input().split()))

s = Stack()
result = s.dailytemp(temperatures)
print(*result)