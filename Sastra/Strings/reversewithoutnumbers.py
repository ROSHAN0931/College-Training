'''Given a string Str, which contains numbers (0 to 9)and also letters of the English and
to 'Z'). The task is to reverse string the string in such a way that the positiors of numbers
in the string are left unaltered.
Input Format

Value of Str
Constraints

NA
Output Format

Strings after altered
Sample Input 0

a1b2igh3
Sample Output 0

h1g2iba3
Explanation 0

Without changing the positions of 1, 2 and 3, only the positions of characters 'h', 'g, "i', 'b'
and 'a' have been reversed.
Sample Input 1

Ab5c7de96
Sample Output 1

ed5c7bA96'''

s = input()
arr = list(s)

left = 0
right = len(arr)-1

while left < right:
    if arr[left].isdigit():
        left += 1
    elif arr[right].isdigit():
        right -= 1
    else:
        arr[left], arr[right] = arr[right], arr[left]
        left += 1
        right -= 1

result = "".join(arr)
print(result)