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
    public void findSum(TreeNode root, int low, int high, int[] sum){
        if(root == null){
            return;
        }

        if(root.val >= low && root.val <= high){
            sum[0]+=root.val;
            findSum(root.left, low, high, sum);
            findSum(root.right, low, high, sum);
        }

        else if(root.val < low){
            findSum(root.right, low, high, sum);
        }

        else if(root.val > high){
            findSum(root.left, low, high, sum);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] sum = new int[1];

        findSum(root, low, high, sum);

        return sum[0];
    }
}
