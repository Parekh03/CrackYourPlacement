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
    public int findHeight(TreeNode node){
        if(node==null){
            return 0;
        }

        int lh = findHeight(node.left);
        int rh = findHeight(node.right);

        return 1 + Math.max(lh, rh);
    }
    public void findDiameter(TreeNode root, int[] maxi){
        if(root==null)
            return;
        
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);

        maxi[0] = Math.max(maxi[0], lh+rh);

        findDiameter(root.left, maxi);
        findDiameter(root.right, maxi);
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;

        int[] maxi = new int[1];

        findDiameter(root, maxi);

        return maxi[0];

    }
}
