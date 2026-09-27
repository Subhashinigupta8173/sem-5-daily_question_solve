// Last updated: 27/9/2026, 12:47:13 pm
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
17    public List<List<Integer>> pathSum(TreeNode root, int targetsum) {
18        List<List<Integer>> ans = new ArrayList<>();
19        List<Integer> path = new ArrayList<>();
20        solve(root , targetsum,path,ans);
21        return ans;
22        
23        
24    }
25    public void solve(TreeNode root,int targetsum,List<Integer> path, List<List<Integer>> ans){
26        if(root == null){
27            return ;
28        }
29        path.add(root.val);
30        targetsum = targetsum - root.val;
31        if(root.left == null && root.right == null){
32            if(targetsum == 0){
33                ans.add(new ArrayList<>(path));
34            }
35        }
36        solve(root.left , targetsum, path, ans);
37        solve(root.right, targetsum, path, ans);
38        path.remove(path.size() - 1);
39    }
40}