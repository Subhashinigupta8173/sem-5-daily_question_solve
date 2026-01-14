// Last updated: 14/1/2026, 3:22:44 pm
1class Solution {
2
3    // Helper function: counts subarrays of consecutive 1s in a row
4    private int countSubarraysOfOnes(int[] rowMask) {
5        int consecutiveOnes = 0;
6        int subarrayCount = 0;
7
8        for (int val : rowMask) {
9            if (val == 0) {
10                consecutiveOnes = 0;
11            } else {
12                consecutiveOnes++;
13            }
14            subarrayCount += consecutiveOnes;
15        }
16
17        return subarrayCount;
18    }
19
20    public int numSubmat(int[][] mat) {
21        int rows = mat.length;
22        int cols = mat[0].length;
23
24        int totalCount = 0;
25
26        // Fix the starting row
27        for (int topRow = 0; topRow < rows; topRow++) {
28            // rowMask[col] = 1 if column col has all 1s between topRow..bottomRow
29            int[] rowMask = new int[cols];
30            for (int i = 0; i < cols; i++) rowMask[i] = 1;
31
32            // Expand bottom row
33            for (int bottomRow = topRow; bottomRow < rows; bottomRow++) {
34                // Update rowMask using AND
35                for (int col = 0; col < cols; col++) {
36                    rowMask[col] = rowMask[col] & mat[bottomRow][col];
37                }
38
39                // Count submatrices from this row span
40                totalCount += countSubarraysOfOnes(rowMask);
41            }
42        }
43
44        return totalCount;
45    }
46}