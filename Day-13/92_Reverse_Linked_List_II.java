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
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next == null)
            return head;

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode lprev = dummy;
        ListNode curr = head;
        int pos = 1;

        while(pos<left){
            lprev = curr;
            curr = curr.next;
            pos++;
        }

        ListNode prev = null;
        for(int i=0; i<right-left+1; i++){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        lprev.next.next = curr;
        lprev.next = prev;

        return dummy.next;


    }
}
