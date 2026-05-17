"""Alice and Bob are batch mates and Alice got placed in a well-reputed product-based
company and his friend Bob is demanding a pizza party from him. Alice is ready for giving
party and he ordered N pizzas from the nearest restaurant. Now pizzas can have at most K
different flavors (It is not necessary that there should be one pizza of each flavor),
numbered from 1 to K such that ⅈ^th pizza can have Ai flavor (1 <= Ai <=k).

Bob is on dieting, and he can only eat pizza of at most k-1 flavors but he can eat as many
pizzas of ith flavor and he wanted to choose maximum possible pizzas which are in contiguous
sequence to one another such that all pizzas in sequence has atmost k-1 flavors.

Input Format

First line consists of Size of input Array and K distinct flavors
Second line consists of array elements
Constraints

1Size of Array
2 Number of different flavors
1 Value of ith flavor 0 base indexing
Output Format

The output will contain a single line containing an integer denoting maximum possible length of subarray.
Sample Input 0

6 2
1 1 1 2 2 1
Sample Output 0

3
Explanation 0

Maximum length subarray with at most k-1 distinct flavors is 3 and sub array is 1 1 1
Sample Input 1

5 3
1 1 2 2 1
Sample Output 1

5
Explanation 1

Since N pizza in total has only 2 flavors so bob can eat all pizza so maximum length of subarray
with at most k-1 distinct flavors is 5 """

n, k = map(int, input().split())
arr = list(map(int, input().split()))
limit = k-1
res = 0

for i in range(n):
    flavor = []
    for j in range(i,n):
        if arr[j] not in flavor:
            flavor.append(arr[j])
        if len(flavor) > limit:
            break
        res = max(res,j-i+1)

print(res)