// Last updated: 21/8/2026, 7:53:02 am
1class Solution {
2    public int countDigitOne(int n) {
3
4        long count = 0;
5
6        for (long factor = 1; factor <= n; factor *= 10) {
7
8            long lower = n % factor;
9            long current = (n / factor) % 10;
10            long higher = n / (factor * 10);
11
12            if (current == 0) {
13                count += higher * factor;
14            }
15            else if (current == 1) {
16                count += higher * factor + lower + 1;
17            }
18            else {
19                count += (higher + 1) * factor;
20            }
21        }
22
23        return (int) count;
24    }
25}