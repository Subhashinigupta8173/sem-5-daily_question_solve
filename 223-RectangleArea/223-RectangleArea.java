// Last updated: 3/9/2025, 8:17:42 am
class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        return helper(a, b, b.length);
    }

    private int helper(int a, int[] b, int k) {
        if (k == 0) return 1; 

        int lastDigit = b[k - 1];
        int part1 = powMod(a, lastDigit);         
        int part2 = powMod(helper(a, b, k - 1), 10);

        return (part1 * part2) % MOD;
    }

 
    private int powMod(int a, int k) {
        a %= MOD;
        int result = 1;
        for (int i = 0; i < k; i++) {
            result = (result * a) % MOD;
        }
        return result;
    }
}
