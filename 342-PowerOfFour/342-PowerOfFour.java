// Last updated: 5/8/2025, 10:24:44 pm
public class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }
}
