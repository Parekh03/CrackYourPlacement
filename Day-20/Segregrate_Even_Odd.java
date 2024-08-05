class Solution {
    Node divide(Node head) {
        // code here
        Node evenHead = new Node(0);
        Node oddHead = new Node(0);
        
        Node evenTemp = evenHead;
        Node oddTemp = oddHead;
        
        Node temp = head;
        while(temp!=null){
            if(temp.data%2==0){
                Node newNode = new Node(temp.data);
                evenTemp.next = newNode;
                evenTemp = newNode;
            }
            
            else{
                Node newNode = new Node(temp.data);
                oddTemp.next = newNode;
                oddTemp = newNode;
            }
            
            temp = temp.next;
        }
        
        if(evenHead.next==null){
            return oddHead.next;
        }
        
        evenTemp.next = oddHead.next;
        
        return evenHead.next;
    }
    
    
}
