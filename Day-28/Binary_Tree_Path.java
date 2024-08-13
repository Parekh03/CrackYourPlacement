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
    public void findPaths(TreeNode root, String str, List<String> list){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            str+=root.val;
            list.add(new String(str));
            return;
        }

        findPaths(root.left, str+root.val+"->", list);
        findPaths(root.right, str+root.val+"->", list);
            
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        String str = "";

        findPaths(root, str, list);

        return list;
    }
}
