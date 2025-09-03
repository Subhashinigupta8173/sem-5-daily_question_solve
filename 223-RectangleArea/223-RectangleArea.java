// Last updated: 3/9/2025, 8:15:41 am
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1; 
            a = a ^ b;               
            b = carry;               
        }
        return a;
    }
}
