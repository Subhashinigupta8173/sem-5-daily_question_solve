// Last updated: 10/7/2026, 10:30:25 pm
1class Solution {
2    public int findNthDigit(int n) {
3
4        long len = 1;
5        long count = 9;
6        long start = 1;
7
8        while (n > len * count) {
9            n -= len * count;
10            len++;
11            count *= 10;
12            start *= 10;
13        }
14
15        long number = start + (n - 1) / len;
16        int index = (int)((n - 1) % len);
17
18        return Long.toString(number).charAt(index) - '0';
19    }
20}