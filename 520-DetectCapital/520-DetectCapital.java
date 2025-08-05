// Last updated: 5/8/2025, 10:24:26 pm
public class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if (n == 1) return true; 
        
        
        if (isAllUpperCase(word)) return true;
        
        
        if (isAllLowerCase(word)) return true;
        
       
        if (isFirstUpperRestLower(word)) return true;
        
        return false; 
    }
    
    private boolean isAllUpperCase(String word) {
        for (char c : word.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean isAllLowerCase(String word) {
        for (char c : word.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean isFirstUpperRestLower(String word) {
        if (!Character.isUpperCase(word.charAt(0))) return false;
        for (int i = 1; i < word.length(); i++) {
            if (!Character.isLowerCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
