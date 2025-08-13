// Last updated: 13/8/2025, 11:33:22 am
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
    int camera=0;
    public int minCameraCover(TreeNode root) {
        int c=minCamera(root);
        if(c==-1){
            camera++;
        }
        return camera;
        
    }
     public int minCamera(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=minCamera(root.left);
        int right=minCamera(root.right); 
        if(left==-1 || right==-1){ //-1 means is node pe camere ki need hai
            camera++;
            return 1;//camera setup kiya hai is node pe
        }
        if(left==1 || right==1){
            // 1 means kisi ak ke passs ya dono ke pass cameras hai  or  ak ke pass camera hai aur  dusara wala covered hai
        return 0;//iska matlab coverd hu
        }
        else{
            return -1;//need to camera to tha root or mere child coverd hai to mujhe to need hogi hi na
        }
    }

}