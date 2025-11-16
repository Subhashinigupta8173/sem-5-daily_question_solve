// Last updated: 16/11/2025, 8:37:11 am
// 
class Solution {
    public long countDistinct(long n) {
        String s = Long.toString(n);
        int len = s.length();
        long ans = 0;

        // Count all numbers with smaller length
        long p = 9;
        for (int i = 1; i < len; i++) {
            ans += p;
            p *= 9;
        }

        // Count same length using prefix logic
        for (int i = 0; i < len; i++) {
            int digit = s.charAt(i) - '0';

            for (int d = (i == 0 ? 1 : 1); d < digit; d++) {
                if (d == 0) continue;
                ans += pow9(len - i - 1);
            }
            if (digit == 0) return ans;
        }

        return ans + 1;
    }

    private long pow9(int e) {
        long r = 1;
        while (e-- > 0) r *= 9;
        return r;
    }
}
