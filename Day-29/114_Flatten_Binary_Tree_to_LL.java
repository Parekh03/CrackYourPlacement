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
    public void preOrder(TreeNode root, List<TreeNode> list){
        if(root==null)
            return;

        list.add(root);
        preOrder(root.left, list);
        preOrder(root.right, list);

    }
    public void flatten(TreeNode root) {
        if(root==null)
            return;
            
        List<TreeNode> list = new ArrayList<>();

        preOrder(root, list);

        TreeNode mover = root;
        mover.left = null;

        for(int i=1; i<list.size(); i++){
            TreeNode newNode = list.get(i);
            mover.right = newNode;

            mover = newNode;
            mover.left = null;
        }
    }
}
