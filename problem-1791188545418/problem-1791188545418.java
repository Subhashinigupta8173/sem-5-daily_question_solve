// Last updated: 5/10/2026, 1:52:25 pm
1class Solution {
2    public int smallestNumber(int n, int t) {
3
4        while(true) {
5
6            int temp = n;
7            int p = 1;
8
9            while(temp != 0) {
10                int rem = temp % 10;
11                temp = temp / 10;
12
13                p = p * rem;
14            }
15
16            if(p % t == 0) {
17                return n;
18            }
19
20            n++;
21        }
22    }
23}