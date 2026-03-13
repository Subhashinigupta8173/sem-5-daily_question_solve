// Last updated: 13/3/2026, 7:07:09 pm
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n=matrix.length;
4        for(int i=0; i<n; i++){
5            for(int j=i; j<n; j++){
6                int temp = matrix[i][j];
7                matrix[i][j] = matrix[j][i];
8                matrix[j][i] = temp;
9            }
10        }
11         
12        for(int i = 0; i < n; i++){
13
14            int left = 0;
15            int right = n - 1;
16
17            while(left < right){
18
19                int temp = matrix[i][left];
20                matrix[i][left] = matrix[i][right];
21                matrix[i][right] = temp;
22
23                left++;
24                right--;
25            }
26        }
27
28        
29    }
30}