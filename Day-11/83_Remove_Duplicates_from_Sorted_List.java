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
    public ListNode deleteDuplicates(ListNode head) {
        // Edge case
        if(head==null || head.next==null)
            return head;

        ListNode newHead = new ListNode();
        newHead.val = -101; // assigning a dummy value 
        ListNode temp = newHead;

        ListNode temp2 =head;
        while(temp2!=null){
            if(temp.val!=temp2.val){
                ListNode newNode = new ListNode();
                newNode.val = temp2.val;
                temp.next = newNode;
                temp = newNode;
            }
            temp2 = temp2.next;
        }
        temp.next = null;

        return newHead.next;
    }
}
