// Last updated: 9/3/2026, 6:00:37 pm
1class Solution {
2    public int reverse(int x) {
3        
4        int rev = 0;
5        
6        while(x != 0){
7            int digit = x % 10;
8            x = x / 10;
9            
10            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10)
11                return 0;
12                
13            rev = rev * 10 + digit;
14        }
15        
16        return rev;
17    }
18}