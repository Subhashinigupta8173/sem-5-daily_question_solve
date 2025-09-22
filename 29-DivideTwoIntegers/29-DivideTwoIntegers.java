// Last updated: 22/9/2025, 9:24:23 pm
class Solution {
    public int divide(int dividend, int divisor) {
        // Edge case: overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) 
            return Integer.MAX_VALUE;

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to negatives to handle overflow
        int dvd = dividend > 0 ? -dividend : dividend;
        int dvs = divisor > 0 ? -divisor : divisor;

        int quotient = 0;

        while (dvd <= dvs) {
            int temp = dvs;
            int multiple = 1;
            // Double temp until it can't be subtracted
            while (temp >= Integer.MIN_VALUE >> 1 && dvd <= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            quotient += multiple;
        }

        return negative ? -quotient : quotient;
    }
}
