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
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public int getDecimalValue(ListNode head) {
        ListNode newHead = reverseList(head);

        int pow = 0;
        int ans = 0;

        ListNode temp = newHead;
        while(temp!=null){
            int data = temp.val;
            for(int i=0; i<pow; i++){
                data = data * 2;
            }
            ans+=data;

            pow++;

            temp = temp.next;
        }

        return ans;
    }
}
