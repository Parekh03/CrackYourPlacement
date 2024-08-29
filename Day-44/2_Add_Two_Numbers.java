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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newhead = new ListNode();
        ListNode temp = newhead;

        ListNode p1 = l1;
        ListNode p2 = l2;

        int carry = 0;

        while(p1!=null || p2!=null){
            int sum = 0;
            if(p1!=null){
                sum+=p1.val;
            }
            if(p2!=null){
                sum+=p2.val;
            }
            sum+=carry;

            ListNode newnode = new ListNode(sum%10);
            temp.next = newnode;
            temp = newnode;

            carry = sum/10;

            if(p1!=null){
                p1 = p1.next;
            }
            if(p2!=null){
                p2 = p2.next;
            }
        }

        if(carry!=0){
            ListNode newnode = new ListNode(carry);
            temp.next = newnode;
            temp = newnode;
        }

        return newhead.next;
    }
}
