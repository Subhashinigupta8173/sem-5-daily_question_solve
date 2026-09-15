// Last updated: 15/9/2026, 10:38:56 pm
1import java.util.HashSet;
2
3class Solution {
4    public boolean isHappy(int n) {
5        HashSet<Integer> seen = new HashSet<>();
6        while (n != 1 && !seen.contains(n)) {
7            seen.add(n);
8            n = getNext(n);
9        }
10        return n == 1;
11    }
12    
13    private int getNext(int n) {
14        int sum = 0;
15        while (n > 0) {
16            int digit = n % 10;
17            sum += digit * digit;
18            n /= 10;
19        }
20        return sum;
21    }
22}
23