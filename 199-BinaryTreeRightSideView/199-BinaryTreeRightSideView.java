// Last updated: 5/8/2025, 10:25:03 pm
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max_depth=0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        rightview(root,1,ll);
        return ll;
    }
    public void rightview(TreeNode root,int curr_level,List<Integer> ll){
        if(root==null){
            return;
        }
        if(max_depth<curr_level){
            //view add krna hai
            // max_depth=curr_level;
            ll.add(root.val);
            max_depth=curr_level;
        }
        rightview(root.right,curr_level+1,ll);
        rightview(root.left,curr_level+1,ll);
    }
}