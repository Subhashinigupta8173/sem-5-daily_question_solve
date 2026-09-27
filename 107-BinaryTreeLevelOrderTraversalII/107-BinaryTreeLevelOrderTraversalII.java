// Last updated: 27/9/2026, 1:00:42 pm
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
17    public List<List<Integer>> levelOrderBottom(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        if(root == null){
20            return ans;
21        }
22        Queue<TreeNode> q = new LinkedList<>();
23        q.add(root);
24        while(!q.isEmpty()){
25            int size = q.size();
26            List<Integer> level = new ArrayList<>();
27            for(int i = 0 ; i < size; i++){
28                TreeNode node = q.poll();
29                level.add(node.val);
30
31                if(node.left != null){
32                    q.add(node.left);
33                }
34                if(node.right != null){
35                    q.add(node.right);
36                }
37            }
38            ans.add(level);
39        }
40        Collections.reverse(ans);
41        return ans;
42
43
44        
45    }
46}