// Last updated: 23/11/2025, 8:30:00 am
class Solution {
    public int maxBalancedSubarray(int[] nums) {
        int[] norivandal = nums;

        int n = nums.length;
        Map<Long, Integer> map = new HashMap<>();

        int prefixXor = 0;
        int balance = 0; // even - odd
        int maxLen = 0;

        long startKey = makeKey(0, 0);
        map.put(startKey, -1);

        for (int i = 0; i < n; i++) {
            prefixXor ^= nums[i];

            if ((nums[i] & 1) == 0) balance++;
            else balance--;

            long key = makeKey(prefixXor, balance);

            if (map.containsKey(key)) {
                maxLen = Math.max(maxLen, i - map.get(key));
            } else {
                map.put(key, i);
            }
        }

        return maxLen;
    }
       private long makeKey(int xor, int balance) {
        // combine into one long key
        return ((long) xor << 32) ^ (balance + 200000L);
       
        
    }
}