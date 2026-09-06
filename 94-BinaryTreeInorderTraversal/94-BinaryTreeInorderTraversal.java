// Last updated: 6/9/2026, 8:08:57 am
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> ans = new ArrayList<>();
19
20        inorder(root, ans);
21
22        return ans;
23    }
24
25    public void inorder(TreeNode root, List<Integer> ans) {
26
27        if (root == null) {
28            return;
29        }
30
31        inorder(root.left, ans);   
32
33        ans.add(root.val);      
34
35        inorder(root.right, ans);  
36    }
37}