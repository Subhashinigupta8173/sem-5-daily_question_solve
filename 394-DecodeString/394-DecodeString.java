// Last updated: 28/9/2026, 2:31:58 pm
1class Solution {
2    public char kthCharacter(long k, int[] operations) {
3
4        long len = 1;
5        int shift = 0;
6
7        int n = 0;
8
9        // Sirf utni length banao jitni k tak pahunchne ke liye needed hai
10        while (len < k) {
11            len = len * 2;
12            n++;
13        }
14
15        // Reverse mein sirf relevant operations dekho
16        for (int i = n - 1; i >= 0; i--) {
17
18            long half = len / 2;
19
20            if (k > half) {
21                k = k - half;
22
23                if (operations[i] == 1) {
24                    shift++;
25                }
26            }
27
28            len = half;
29        }
30
31        return (char) ('a' + (shift % 26));
32    }
33}