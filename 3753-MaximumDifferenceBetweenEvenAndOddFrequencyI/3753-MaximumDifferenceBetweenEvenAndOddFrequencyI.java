// Last updated: 5/8/2025, 10:23:29 pm


class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Step 1: Count character frequencies
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find max odd and min even frequency
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int freq : freqMap.values()) {
            if (freq % 2 == 1) {
                maxOdd = Math.max(maxOdd, freq); // Maximum odd frequency
            } else {
                minEven = Math.min(minEven, freq); // Minimum even frequency
            }
        }

        // Step 3: Return the difference
        return maxOdd - minEven;
    }
}

