// Last updated: 5/8/2025, 11:33:51 pm
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < start) {
                merged.add(new int[]{start, end});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], end);
            }
        }

     
        return merged.toArray(new int[merged.size()][]);
    }
}
