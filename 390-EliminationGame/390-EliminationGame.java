// Last updated: 29/9/2026, 11:42:58 am
1class Solution {
2    public int lastRemaining(int n) {
3        int head = 1;
4        int step = 1;
5        int remaining  = n;
6        boolean left = true;
7        while(remaining > 1){
8            if(left || remaining % 2 == 1){
9                head = head + step;
10            }
11            remaining = remaining / 2;
12            step = step * 2;
13            left  = !left;
14        }
15        return head; 
16
17        
18    }
19}