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
    public void findSum(TreeNode root, int[] sum){
        if(root==null || root.left == null)
            return;
            
        if(root.left!=null)
            sum[0]+=root.left.val;
        
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null || root.next==null)
            return 0;
        
        int ans = 0;

    }
}
