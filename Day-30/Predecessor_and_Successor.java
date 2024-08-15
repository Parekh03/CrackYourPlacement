class Solution {
    public static void inorder(Node root, Node[] pre, Node[] suc, int key){
        if(root==null)
            return;
            
        inorder(root.left, pre, suc, key);
        
        if(root.data<key){
            pre[0] = root;
        }
        
        if (root.data > key && suc[0]==null) {
            suc[0] = root;
        }
        
        inorder(root.right, pre, suc, key);
        
    }
    public static void findPreSuc(Node root, Node[] pre, Node[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key
        
        inorder(root, pre, suc, key);
        
        if(pre[0]==null){
            pre[0] = new Node(-1);
        }
            
        if(suc[0]==null){
            suc[0] = new Node(-1);
        }
        
        
    }
}
