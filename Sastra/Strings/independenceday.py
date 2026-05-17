'''Blake is a teacher organizing the Independence Day parade. There are N students in a
line, some dressed formally and others informally, Blake's goal is to make sure all the
students are dressed formally. She selects the first student who is dressed informally and
provide him with formal clothes. But since she is in a hurry, she picks the entire continuous
segment that covers all the informally dressed students and remove them from the parade in order
to start the parade quickly.

You are given a string where:

F' represents a student dressed formally.

I' represents a student dressed informally.

Your task is to find and return the minimum length of the segment Blake needs to remove to ensure
all the students are dressed formally.

Note: There is at least one student in the line always.

Input Format

An integer value N representing the length of the students lined up.
A string value representing the dresses of the N students lined up.
Constraints

NA

Output Format

Return the minimum length of the segment Blake needs to remove to ensure all the students are
dressed formally

Sample Input 0

10
FIFFIIFFFI
Sample Output 0

6
Explanation 0

Here, in the given lineup. FIFFIIFFEL Blake starts by selecting the first informally dressed
student and provides them with formal clothes, now the lineup becomes FFFFIIFFFI. Then the
continuous segment of informally dressed students she needs to remove is IIFFFI. The length
of this segment is 6. Hence, 6 is returned as the output.

Sample Input 1

8
FFFFFFFF
Sample Output 1

0
Explanation 1

Here, the given line up is FFFFFFFF. Since there are no students dressed informally. O is
returned as the output.'''


n = int(input())
s = input()

# Find first I
first = s.find('I')

# If no I present
if first == -1:
    print(0)

else:
    # Convert first I to F
    s = s[:first] + 'F' + s[first+1:]

    # Find new first and last I
    first_i = s.find('I')
    last_i = s.rfind('I')

    # If no more I
    if first_i == -1:
        print(0)
    else:
        print(last_i - first_i + 1)