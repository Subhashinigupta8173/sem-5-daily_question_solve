// Last updated: 5/8/2025, 10:26:08 pm
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[] = new int[256]; 
        Arrays.fill(hash, -1);
        int n = s.length();
        int l = 0, r = 0;
        int maxL = 0;

        while (r < n) {
            if (hash[s.charAt(r)] != -1 && hash[s.charAt(r)] >= l) {
                l = hash[s.charAt(r)] + 1;
            }
            maxL = Math.max(maxL, r - l + 1);
            hash[s.charAt(r)] = r;
            r++;
        }

        return maxL;
    }
}