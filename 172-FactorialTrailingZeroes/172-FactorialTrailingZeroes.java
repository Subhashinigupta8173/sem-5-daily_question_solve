// Last updated: 24/9/2025, 8:25:16 pm
class Solution {
    public int trailingZeroes(int n) {
        
        int count = 0;
        // keep dividing n by 5, 25, 125, ...
        for (long p = 5; p <= n; p *= 5) {
            count += n / p;
        }
        return count;
    }
}