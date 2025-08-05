// Last updated: 5/8/2025, 10:24:37 pm
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] letterCount = new int[26]; 
        

        for (char c : magazine.toCharArray()) {
            letterCount[c - 'a']++;
        }
        
        
        for (char c : ransomNote.toCharArray()) {
            if (letterCount[c - 'a'] == 0) {
                return false; 
            }
            letterCount[c - 'a']--;
        }
        
        return true; 
    }
}
