'''Write a program that reads a square matrix (garden layout) and outputs its transpose.

Input Format

The first line contains an integer n, representing the number of rows and columns of the square
matrix (n x n).
The next n lines contain space-separated integers representing the matrix.
Constraints

The matrix is a square matrix (i.e., the number of rows equals the number of columns).

Output Format

Print the transposed matrix, with each row on a new line and elements separated by spaces.

Sample Input 0

3
1 2 3
4 5 6
7 8 9
Sample Output 0

1 4 7
2 5 8
3 6 9 '''

n = int(input())
arr = []

for i in range(n):
    arr.append(list(map(int,input().split())))

for i in range(n):
    for j in range(n):
        print(arr[j][i],end=" ")
    print()

