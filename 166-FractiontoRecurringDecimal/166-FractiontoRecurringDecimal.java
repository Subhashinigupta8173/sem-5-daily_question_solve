// Last updated: 24/9/2025, 8:20:43 pm


class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder sb = new StringBuilder();

        // Handle sign
        if ((numerator < 0) ^ (denominator < 0)) sb.append("-");

        // Use long to avoid overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Integer part
        sb.append(num / den);
        long remainder = num % den;
        if (remainder == 0) return sb.toString();

        sb.append(".");
        Map<Long, Integer> map = new HashMap<>(); // remainder -> index in sb

        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                int index = map.get(remainder);
                sb.insert(index, "(");
                sb.append(")");
                break;
            }
            map.put(remainder, sb.length());
            remainder *= 10;
            sb.append(remainder / den);
            remainder %= den;
        }

        return sb.toString();
    }
}
