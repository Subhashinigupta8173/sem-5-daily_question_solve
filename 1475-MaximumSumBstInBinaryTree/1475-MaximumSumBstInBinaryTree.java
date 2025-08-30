// Last updated: 30/8/2025, 8:24:27 pm
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
    public int maxSumBST(TreeNode root) {
        return isValid(root).ans;
    }
    public bst isValid(TreeNode root){
        if(root==null){
            return new bst();
        }
        bst lbp=isValid(root.left);
        bst rbp=isValid(root.right);
        bst sbp=new bst();
        sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.min=Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.sum=lbp.sum+rbp.sum+root.val;
        sbp.isbst=lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val;
        if(sbp.isbst){
            sbp.ans=Math.max(lbp.ans,Math.max(rbp.ans,sbp.sum));
        }
        else{
            sbp.ans=Math.max(lbp.ans,rbp.ans);
        }
        return sbp;
    }
    public class bst{
        boolean isbst=true;
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        int sum=0;
        int ans=0; //only maximum bst part ka sum
    } 
}