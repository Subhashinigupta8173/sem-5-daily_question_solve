// Last updated: 26/9/2026, 6:05:07 pm
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
17    public boolean isBalanced(TreeNode root) {
18        return  Findheight(root) != -1;
19    }
20    public int Findheight(TreeNode root){
21        if(root == null){
22            return 0;
23        }
24        int leftheight = Findheight(root.left);
25        if(leftheight == -1){
26            return -1;
27        }
28        int rightheight = Findheight(root.right);
29        if(rightheight == -1){
30            return -1;
31        }
32        if((Math.abs(leftheight - rightheight)) > 1){
33            return -1;
34        }
35
36
37
38        return Math.max(leftheight , rightheight) + 1;
39            
40
41    }
42        
43}