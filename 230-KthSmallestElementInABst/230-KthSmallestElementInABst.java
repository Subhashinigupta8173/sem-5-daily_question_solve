// Last updated: 30/8/2025, 8:24:59 pm
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
    int min=0;
    int c=0;
    public int kthSmallest(TreeNode root, int k) {
        Inorder(root,k);
        return min;
        

        
    }
    private void Inorder(TreeNode root,int k){
        if(root==null){
            return;
        }
        Inorder(root.left,k);
        c++;
        if(c==k){
            min=root.val;
            return ;
        }
        Inorder(root.right,k);
    }
}