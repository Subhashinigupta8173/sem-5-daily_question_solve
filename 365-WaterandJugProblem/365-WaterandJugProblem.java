// Last updated: 24/9/2025, 8:31:07 pm
class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if (target > x + y) return false;
        if (target == x || target == y || target == x + y) return true;
        return target % gcd(x, y) == 0;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
        
    }
}