// Last updated: 27/9/2026, 12:24:04 pm
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
17    public int minDepth(TreeNode root) {
18        if(root == null){
19            return 0;
20        }
21        if(root.left == null){
22            return 1 + minDepth(root.right);
23        }
24
25        if(root.right == null){
26            return 1 + minDepth(root.left);
27        }
28        int left = minDepth(root.left);
29        int right = minDepth(root.right);
30        
31        return 1+ Math.min(left, right);
32
33    }
34}