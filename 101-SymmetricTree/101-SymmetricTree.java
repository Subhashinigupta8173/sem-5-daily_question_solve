// Last updated: 14/8/2026, 10:26:29 am
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
16class Solution {
17    public boolean isSymmetric(TreeNode root) {
18        return check(root.left, root.right);
19    }
20
21    public boolean check(TreeNode left, TreeNode right) {
22
23       
24        if (left == null && right == null) {
25            return true;
26        }
27
28        
29        if (left == null || right == null) {
30            return false;
31        }
32
33       
34        if (left.val != right.val) {
35            return false;
36        }
37
38        // Mirror comparison
39        return check(left.left, right.right)
40                && check(left.right, right.left);
41    }
42}