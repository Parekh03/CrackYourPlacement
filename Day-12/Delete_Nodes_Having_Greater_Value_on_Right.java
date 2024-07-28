class Solution
{
    Node reverseList(Node head){
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
    Node compute(Node head)
    {
        // your code here
        Node newHead = reverseList(head);
        
        Node prev = newHead;
        Node curr = prev.next;
        
        int max = prev.data;
        
        while(curr!=null){
            if(curr.data<max){
                prev.next = curr.next;
                curr = prev.next;
            }
            else{
                prev = curr;
                max = Math.max(max, curr.data);
                curr = curr.next;
            }
        }
        
        Node ans = reverseList(newHead);
        
        return ans;
    }
}
  
