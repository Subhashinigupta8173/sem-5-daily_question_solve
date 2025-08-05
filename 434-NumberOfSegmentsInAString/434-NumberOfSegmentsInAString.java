// Last updated: 5/8/2025, 10:24:32 pm
public class Solution {
    public int countSegments(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        
        s = s.trim();
        
        
        if (s.isEmpty()) {
            return 0;
        }
        
        
        String[] segments = s.split("\\s+");
        
        
        return segments.length;
    }
}
