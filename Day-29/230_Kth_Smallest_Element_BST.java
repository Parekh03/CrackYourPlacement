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
    public void inOrder(TreeNode root, int[] count, int k, int[] ans){
        if(root==null){
            return;
        }

        inOrder(root.left, count, k, ans);
        count[0]++;
        if(count[0]==k){
            ans[0] = root.val;
            return;
        }
        inOrder(root.right, count, k, ans);
    }
    public int kthSmallest(TreeNode root, int k) {
        int[] count = {0};
        int[] ans = {0};
        inOrder(root, count, k, ans);

        return ans[0];
    }
}
