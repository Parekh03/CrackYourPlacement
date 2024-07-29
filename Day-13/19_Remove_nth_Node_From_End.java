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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;
        if(head.next==null && n==1)
            return null;

        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }

        if(n==len){
            return head.next;
        }

        ListNode prev = null;
        ListNode curr = head;
        int pos = 1;

        while(pos<len-n+1){
            prev = curr;
            curr = curr.next;
            pos++;
        }

        prev.next = curr.next;

        return head;
    }
}
