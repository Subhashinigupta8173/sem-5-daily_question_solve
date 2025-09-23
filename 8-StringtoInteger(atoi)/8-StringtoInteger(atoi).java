// Last updated: 23/9/2025, 11:48:33 pm
import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
        // List of numbers to get elements from
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        // Factorials up to n
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        
        // Convert k to 0-based index
        k--;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = n; i >= 1; i--) {
            int index = k / factorial[i - 1];
            sb.append(numbers.get(index));
            numbers.remove(index);
            
            k = k % factorial[i - 1];
        }
        
        return sb.toString();
    }
}
