class Solution
{
    public void countNodes(Node root, int[] count, int l, int r){
        if(root==null)
            return;
            
        if(root.data<l){
            countNodes(root.right, count, l ,r);
        }
        
        else if(root.data>r){
            countNodes(root.left, count, l ,r);
        }
        
        else{
            count[0]++;
            countNodes(root.left, count, l, r);
            countNodes(root.right, count, l, r);
        }
    }
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        //Your code here
        int[] count = new int[1];
        countNodes(root, count, l, h);
        
        return count[0];
        
    }
}
