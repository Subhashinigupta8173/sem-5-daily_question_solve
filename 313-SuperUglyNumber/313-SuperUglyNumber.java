// Last updated: 3/9/2025, 8:27:39 am
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0"; 

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();

       
        long n = num & 0xFFFFFFFFL;

        while (n != 0) {
            int digit = (int)(n & 0xF); 
            sb.append(hexChars[digit]);
            n >>= 4;
        }

        return sb.reverse().toString(); 
    }
}
