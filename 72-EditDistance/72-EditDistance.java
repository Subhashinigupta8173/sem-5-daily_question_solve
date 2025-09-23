// Last updated: 23/9/2025, 6:06:52 am
class Solution {
    public String reverseWords(String s) {
        // Trim and split by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        // Reverse words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        
        return sb.toString();
    }
}
