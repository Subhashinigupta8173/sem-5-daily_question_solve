// Last updated: 27/9/2026, 5:53:36 pm
1class Solution {
2    public double myPow(double x, int n) {
3        long N = n;
4        while (N < 0) {
5            x = 1 / x;
6            N = -N;
7        }
8        return Power(x,N);
9    }
10
11    public static double  Power(double x, long n){
12        if(n == 0){
13            return 1.0;
14        }
15        double half  = Power(x , n/2);
16        if(n % 2  == 0){
17            return half * half;
18        }
19
20        return x * half * half;
21    }
22}