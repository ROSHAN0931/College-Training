'''A warehouse manager wants to ensure the stability of goods stacked in a pyramid-like
arrangement. The goods are arranged in a matrix format, where each level of goods can only
rest on top of a larger base below. This means that there should not be any goods above the
diagonal if the matrix is to be considered stable.

Write a program to check if the given matrix is a lower triangular matrix. A lower triangular
matrix is one where all the entries above the main diagonal are zero.

Input Format

The first line of input contains an integer n, which represents the number of rows and columns in
the matrix (n x n matrix).
The next n lines contain n integers each, representing the elements in the matrix.
Constraints

NA

Output Format

Print "Yes" if the matrix is a lower triangular matrix.
Print "No" if the matrix is not a lower triangular matrix.
Sample Input 0

3
1 0 0
2 3 0
4 5 6
Sample Output 0

Yes
Explanation 0

Input Details

The warehouse has goods arranged in a 3x3 matrix:

1 0 0

2 3 0

4 5 6

Lower Triangular Matrix Check

All elements above the main diagonal are 0, making it a stable load arrangement.
Since it satisfies the condition, the output is "Yes."'''

# read size
n = int(input())

# read matrix
a = []

for i in range(n):
    row = list(map(int, input().split()))
    a.append(row)

# assume matrix is lower triangular
flag = True

# check elements above diagonal
for i in range(n):
    for j in range(i + 1, n):

        if a[i][j] != 0:
            flag = False

# print answer
if flag:
    print("Yes")
else:
    print("No")