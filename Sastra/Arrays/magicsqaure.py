'''A famous museum is organizing a special exhibition where artifacts must be arranged in a
unique format called a "Magic Square." A Magic Square is a grid of numbers where the sum of
every row, every column, and both main diagonals are equal. The curator needs to check if a
given grid arrangement forms a Magic Square to ensure the exhibition is set up correctly.

Write a program to verify if the given arrangement of artifacts forms a Magic Square.

Input Format

The first line of input contains an integer n, which represents the number of rows and columns
in the square (n x n grid).
The next n lines contain n integers each, representing the arrangement of artifacts.
Constraints

NA

Output Format

Print "Yes" if the grid forms a Magic Square.
Print "No" if it does not form a Magic Square.
Sample Input 0

3
8 1 6
3 5 7
4 9 2
Sample Output 0

Yes
Explanation 0

Input Details

The museum has arranged artifacts in a 3x3 grid:

8 1 6

3 5 7

4 9 2

Magic Square Validation

The sum of each row: 8 + 1 + 6 = 15, 3 + 5 + 7 = 15, 4 + 9 + 2 = 15.

The sum of each column: 8 + 3 + 4 = 15, 1 + 5 + 9 = 15, 6 + 7 + 2 = 15.

The sum of both diagonals: 8 + 5 + 2 = 15, 6 + 5 + 4 = 15.

Since all sums are equal, the arrangement forms a Magic Square.'''

# read size
n = int(input())

# read matrix
a = []

for i in range(n):
    row = list(map(int, input().split()))
    a.append(row)

# first row sum
s = sum(a[0])

magic = True

# check row sums
for i in range(n):
    if sum(a[i]) != s:
        magic = False

# check column sums
for j in range(n):
    col_sum = 0

    for i in range(n):
        col_sum += a[i][j]

    if col_sum != s:
        magic = False

# check main diagonal
d1 = 0
for i in range(n):
    d1 += a[i][i]

if d1 != s:
    magic = False

# check second diagonal
d2 = 0
for i in range(n):
    d2 += a[i][n - i - 1]

if d2 != s:
    magic = False

# print result
if magic:
    print("Yes")
else:
    print("No")