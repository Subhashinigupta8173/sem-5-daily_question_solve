// Last updated: 8/9/2026, 10:36:24 pm
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16/**
17 * Definition for a binary tree node.
18 * public class TreeNode {
19 *     int val;
20 *     TreeNode left;
21 *     TreeNode right;
22 *     TreeNode() {}
23 *     TreeNode(int val) { this.val = val; }
24 *     TreeNode(int val, TreeNode left, TreeNode right) {
25 *         this.val = val;
26 *         this.left = left;
27 *         this.right = right;
28 *     }
29 * }
30 */
31class Solution {
32    public boolean isSameTree(TreeNode p, TreeNode q) {
33
34      
35        if (p == null && q == null) {
36            return true;
37        }
38
39     
40        if (p == null || q == null) {
41            return false;
42        }
43
44        if (p.val != q.val) {
45            return false;
46        }
47
48   
49        boolean l = isSameTree(p.left, q.left);
50        boolean r = isSameTree(p.right, q.right);
51
52        return l && r;
53    }
54}