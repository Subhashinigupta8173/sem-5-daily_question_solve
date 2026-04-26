// Last updated: 26/4/2026, 5:26:51 pm
1class Solution {
2    static final int MOD = 1000000007;
3
4    public int countGoodNumbers(long n) {
5        long even = (n + 1) / 2;
6        long odd = n / 2;
7
8        return (int)((power(5, even) * power(4, odd)) % MOD);
9    }
10
11    public long power(long x, long n) {
12        if (n == 0) return 1;
13
14        long half = power(x, n / 2);
15
16        if (n % 2 == 0) return (half * half) % MOD;
17        return (half * half % MOD * x) % MOD;
18    }
19}