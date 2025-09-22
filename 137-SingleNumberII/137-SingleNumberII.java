// Last updated: 22/9/2025, 9:17:29 pm
import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;

        int start = nums[0];

        for (int i = 1; i <= nums.length; i++) {
            // check if end of range
            if (i == nums.length || nums[i] != nums[i-1] + 1) {
                if (start == nums[i-1]) {
                    res.add(String.valueOf(start)); // single number
                } else {
                    res.add(start + "->" + nums[i-1]); // range
                }
                if (i < nums.length) start = nums[i]; // start new range
            }
        }

        return res;
    }
}
