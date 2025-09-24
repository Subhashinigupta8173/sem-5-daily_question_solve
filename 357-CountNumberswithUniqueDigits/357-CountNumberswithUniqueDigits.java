// Last updated: 24/9/2025, 8:30:01 pm
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int count = 10; // for n=1, we have 10 numbers (0-9)
        int unique = 9; // first digit choices (1-9)
        int available = 9; // remaining digit choices
        
        for (int i = 2; i <= n && available > 0; i++) {
            unique = unique * available;
            count += unique;
            available--;
        }
        return count;
        
    }
}