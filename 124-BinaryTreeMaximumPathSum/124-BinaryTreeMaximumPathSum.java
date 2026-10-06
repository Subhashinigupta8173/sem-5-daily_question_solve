// Last updated: 6/10/2026, 4:45:07 pm
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
17    int ans = Integer.MIN_VALUE;
18    public int maxPathSum(TreeNode root) {
19        find(root);
20        return ans;
21        
22    }
23    public int find(TreeNode root){
24        if(root == null){
25            return 0;
26        }
27        int left = Math.max(0, find(root.left));
28        int right = Math.max(0, find(root.right));
29        ans = Math.max(ans,left + root.val + right);
30        return root.val + Math.max(left , right);
31    }
32}