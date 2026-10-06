// Last updated: 6/10/2026, 4:16:11 pm
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
18        List<Integer> ll = new LinkedList<>();
19
20        if (root == null) {
21            return ll;
22        }
23
24        ll.addAll(inorderTraversal(root.left));
25        ll.add(root.val);
26        ll.addAll(inorderTraversal(root.right));
27
28        return ll;
29       
30    }
31}