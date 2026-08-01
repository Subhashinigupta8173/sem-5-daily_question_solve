// Last updated: 1/8/2026, 10:21:04 am
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4        
5        
6        for (int i = 0; i < n; i++) {
7            for (int j = i; j < n; j++) {
8                int temp = matrix[i][j];
9                matrix[i][j] = matrix[j][i];
10                matrix[j][i] = temp;
11            }
12        }
13
14        
15        for (int i = 0; i < n; i++) {
16            for (int j = 0; j < n / 2; j++) {
17                int temp = matrix[i][j];
18                matrix[i][j] = matrix[i][n - 1 - j];
19                matrix[i][n - 1 - j] = temp;
20            }
21        }
22    }
23
24    public static void main(String[] args) {
25        Scanner scanner = new Scanner(System.in);
26        System.out.println();
27
28        
29        int n = scanner.nextInt();
30
31        if (n <= 0) {
32            System.out.println();
33            return;
34        }
35
36        int[][] matrix = new int[n][n];
37
38        System.out.println();
39        for (int i = 0; i < n; i++) {
40            for (int j = 0; j < n; j++) {
41                matrix[i][j] = scanner.nextInt();
42            }
43        }
44
45        Solution solution = new Solution();
46        solution.rotate(matrix);
47
48        System.out.println();
49        for (int i = 0; i < n; i++) {
50            for (int j = 0; j < n; j++) {
51                System.out.print(matrix[i][j] + " ");
52            }
53            System.out.println();
54        }
55    }
56}
57