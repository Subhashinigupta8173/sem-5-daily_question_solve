// Last updated: 3/1/2026, 9:44:09 pm
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> ans = new ArrayList<>();
4
5        int m = matrix.length;
6        int n = matrix[0].length;
7
8        int top = 0, bottom = m - 1;
9        int left = 0, right = n - 1;
10
11        while (top <= bottom && left <= right) {
12
13        
14            for (int j = left; j <= right; j++) {
15                ans.add(matrix[top][j]);
16            }
17            top++;
18
19    
20            for (int i = top; i <= bottom; i++) {
21                ans.add(matrix[i][right]);
22            }
23            right--;
24
25            
26            if (top <= bottom) {
27                for (int j = right; j >= left; j--) {
28                    ans.add(matrix[bottom][j]);
29                }
30                bottom--;
31            }
32
33            
34            if (left <= right) {
35                for (int i = bottom; i >= top; i--) {
36                    ans.add(matrix[i][left]);
37                }
38                left++;
39            }
40        }
41
42        return ans;
43    }
44}
45