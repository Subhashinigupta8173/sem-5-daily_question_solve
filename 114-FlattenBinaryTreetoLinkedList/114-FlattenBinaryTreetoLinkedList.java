// Last updated: 19/8/2026, 11:02:16 am
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
17    public void flatten(TreeNode root) {
18        MakeLL(root);
19        
20    }
21    public TreeNode MakeLL(TreeNode root){
22        if(root==null){
23            return null;
24        }
25        if(root.left==null && root.right==null){
26            return root;
27        }
28
29
30        TreeNode left_tail=MakeLL(root.left);
31        TreeNode right_tail=MakeLL(root.right);
32        if(root.left!=null){
33            left_tail.right=root.right;
34            root.right=root.left;
35            root.left=null;
36            
37        }
38        return right_tail!=null ? right_tail:left_tail;
39
40    }
41}