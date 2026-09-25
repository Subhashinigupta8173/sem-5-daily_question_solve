// Last updated: 25/9/2026, 11:44:26 am
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        Queue<TreeNode> q = new LinkedList<TreeNode>();
19        List<List<Integer>> result = new LinkedList<List<Integer>>();
20        if(root == null){
21            return result;
22        }
23        q.offer(root);
24        while(!q.isEmpty()){
25            int levelsize  = q.size();
26            List<Integer> level = new LinkedList<Integer>();
27            for(int i = 0; i < levelsize; i++){
28                if(q.peek().left != null) q.offer(q.peek().left);
29                if(q.peek().right !=  null) q.offer(q.peek().right);
30                level.add(q.poll().val);
31            }
32            result.add(level);
33        }
34        return result;
35    }
36}