// Last updated: 23/11/2025, 8:21:26 am
class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        long x = 0;     // number formed by non-zero digits
        int sum = 0;    // sum of those digits

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';  // convert char → int

            if (digit != 0) {
                x = x * 10 + digit;  // build number
                sum += digit;        // accumulate sum
            }
        }

        // If no non-zero digits → x = 0 → return 0
        return x * sum;
    }
}
