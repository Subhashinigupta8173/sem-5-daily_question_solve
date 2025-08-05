// Last updated: 5/8/2025, 10:24:22 pm
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> s1Map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> s2Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s2.charAt(i);
            s2Map.put(c, s2Map.getOrDefault(c, 0) + 1);
        }

        if (s1Map.equals(s2Map)) return true;

        for (int i = s1.length(); i < s2.length(); i++) {
            char cIn = s2.charAt(i);
            char cOut = s2.charAt(i - s1.length());

            s2Map.put(cIn, s2Map.getOrDefault(cIn, 0) + 1);
            if (s2Map.get(cOut) == 1) {
                s2Map.remove(cOut);
            } else {
                s2Map.put(cOut, s2Map.get(cOut) - 1);
            }

            if (s1Map.equals(s2Map)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println();
        System.out.println( solution.checkInclusion("ab", "eidbaooo"));

        System.out.println();
        System.out.println( solution.checkInclusion("ab", "eidboaoo"));
    }
}
