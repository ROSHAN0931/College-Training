'''You are the organizer of a local book club, and you want to prepare for the next meeting
by creating trivia questions based on unique chapter titles from the books your members have
read. To do this, you need to analyze a chapter title and count the unique substrings. Your
task is to find and return an integer value representing the count of the unique substrings
of a specific length K.

Input Format

A string S representing the chapter title
An integer value K representing the length of the substrings.
Constraints

NA

Output Format

Return an integer value representing the count of the unique substrings of a specific length K.

Sample Input 0

abcabc
3
Sample Output 0

3
Explanation 0

Here, the book title is "abcabc" and K = 3. The unique substrings of length 3 that can be formed are:

"abc"
"bca"
"cab"
Since there are 3 unique substrings, 3 is returned as the output.

Sample Input 1

abcd
2
Sample Output 1

3
Explanation 1

Here, the book title is "abcd" and K = 2. The unique substrings of length 2 that can be formed are:

"ab"
"bc"
"cd"
Since there are 3 unique substrings, 3 is returned as the output.'''

# Read string
s = input()

# Read substring length
k = int(input())

# Empty set for unique substrings
unique = set()

# Find all substrings of length k
for i in range(len(s) - k + 1):

    # Take substring
    sub = s[i:i+k]

    # Add into set
    unique.add(sub)

# Print count of unique substrings
print(len(unique))