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
    public int findHeight(TreeNode root){
        if(root==null)
            return 0;

        int lh = findHeight(root.left);
        int rh = findHeight(root.right);

        return 1 + Math.max(lh, rh);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;

        int ls = findHeight(root.left);
        int rs = findHeight(root.right);

        if(Math.abs(ls-rs)<=1){
            return isBalanced(root.left) && isBalanced(root.right);
        }
        
        return false;
    }
}
