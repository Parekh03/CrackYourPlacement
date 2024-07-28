/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        
        if(head.next==null){
            if(head.val==val)
                return null;
            else
                return head;
        }

        ListNode newHead = new ListNode();
        ListNode temp = newHead;

        ListNode curr = head;

        while(curr!=null){
            if(curr.val!=val){
                ListNode newNode = new ListNode();
                newNode.val = curr.val;
                temp.next = newNode;
                temp  = newNode;
            }
            curr = curr.next;
        }

        return newHead.next;
    }
}
