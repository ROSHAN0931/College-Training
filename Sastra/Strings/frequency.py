'''Given a string in which the same character occurs in many consecutive character elements.
Your task is to find the characters that have even frequency and are consecutive. Display the
sum of every frequency count( For even frequency only)

Input Format

Consists of strings

Constraints

NA

Output Format

Integer value

Sample Input 0

aaabbaccccdd
Sample Output 0

8
Sample Input 1

vdkkmmmnn
Sample Output 1

4'''

s = input()
total = 0
count = 1

for i in range(1,len(s)):
    if s[i] == s[i-1]:
        count += 1
    else:
        if count % 2 == 0:
            total += count

        count = 1

if count % 2 == 0:
    total += count
print(total)