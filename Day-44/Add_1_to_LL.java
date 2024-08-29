class Solution {
    public Node reverse(Node head){
        if(head==null || head.next == null){
            return head;
        }
        
        Node prev = null;
        Node curr = head;
        
        while(curr!=null){
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        
        if(head==null){
            return head;
        }
        
        int carry = 1;
        Node temp = reverse(head);
        Node newhead = new Node(0);
        Node newtemp = newhead;
        
        while(temp!=null){
            int sum = temp.data + carry;
            
            Node newnode = new Node(sum%10);
            newtemp.next = newnode;
            newtemp = newnode;
            
            carry = sum/10;
            
            temp = temp.next;
        }
        
        if(carry!=0){
            Node newnode = new Node(carry);
            newtemp.next = newnode;
            newtemp = newnode;
        }
        
        newhead = newhead.next;
        
        
        return reverse(newhead);
        
    }
}
