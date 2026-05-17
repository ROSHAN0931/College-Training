'''Imagine a cinema hall represented as a grid with m rows and n columns.
Each seat is either reserved or vacant. A reserved seat is marked with a 1, and
a vacant seat is marked with a 0. If any seat becomes unavailable (marked as 0),
the entire row and column that contain the unavailable seat must be marked as 0 to
indicate that no seat in that row or column can be booked.

Write a program to manage the cinema seat bookings based on the above scenario.
If a seat becomes unavailable (marked as 0), update the cinema hall's seating arrangement
by setting all seats in that row and column to 0.

Input Format

The first line contains two integers, m and n, representing the number of rows and columns
in the cinema hall.
The next m lines contain n integers (either 0 or 1), representing the seating arrangement
of the cinema hall.
Constraints

NA

Output Format

Output the updated seating arrangement of the cinema hall after marking the unavailable seats.

Sample Input 0

3 3
1 1 1
1 0 1
1 1 1
Sample Output 0

1 0 1
0 0 0
1 0 1'''

r, c = map(int,input().split())
arr = []
for i in range(r):
    arr.append(list(map(int,input().split())))

rows = []
cols = []
for i in range(r):
    for j in range(c):
        if arr[i][j]==0:
            rows.append(i)
            cols.append(j)

for i in range(r):
    for j in range(c):
        if i in rows or j in cols:
            arr[i][j]=0

for i in range(r):
    for j in range(c):
        print(arr[i][j],end=" ")
    print()

