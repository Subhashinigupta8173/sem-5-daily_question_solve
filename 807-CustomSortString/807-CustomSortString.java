// Last updated: 5/8/2025, 10:24:12 pm
public class Solution {
    public String customSortString(String order, String s) {
        
        int[] charCount = new int[26];
        
        
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        StringBuilder result = new StringBuilder();
        
        
        for (char c : order.toCharArray()) {
            while (charCount[c - 'a'] > 0) {
                result.append(c);
                charCount[c - 'a']--;
            }
        }
        
        
        for (char c : s.toCharArray()) {
            if (charCount[c - 'a'] > 0) {
                result.append(c);
                charCount[c - 'a']--;
            }
        }
        
        return result.toString();
    }
}
