// Last updated: 5/8/2025, 10:23:56 pm
public class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        int[] maxFreq = new int[26];
        for (String b : words2) {
            int[] freq = countFrequency(b);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }
        
        
        List<String> result = new ArrayList<>();
        for (String a : words1) {
            int[] freq = countFrequency(a);
            boolean universal = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxFreq[i]) {
                    universal = false;
                    break;
                }
            }
            if (universal) {
                result.add(a);
            }
        }
        
        return result;
    }
    
    private int[] countFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
}
