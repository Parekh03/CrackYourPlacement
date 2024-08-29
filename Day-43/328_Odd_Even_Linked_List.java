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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next == null){
            return head;
        }

        ListNode firstOdd = head;
        ListNode firstEven = head.next;

        ListNode tempOdd = head;
        ListNode tempEven = head.next;

        while(tempOdd.next!=null && tempEven.next!=null){
            tempOdd.next = tempEven.next;
            tempOdd = tempOdd.next;

            tempEven.next = tempOdd.next;
            tempEven = tempEven.next;
        }

        tempOdd.next = firstEven;

        return head;
    }
}
