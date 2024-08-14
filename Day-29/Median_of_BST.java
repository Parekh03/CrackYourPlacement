class Tree
{
    public static void inOrder(Node root, List<Integer> list){
        if(root==null)
            return;
        
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
    public static float findMedian(Node root)
    {
        // code here.
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        
        if(list.size()%2==0){
            float m1 = list.get(list.size()/2);
            float m2=  list.get((list.size()/2)-1);
            
            return (m1+m2)/2;
        }
        
        return (float)(list.get(list.size()/2));
        
    }
}
