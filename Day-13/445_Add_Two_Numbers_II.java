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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode();
        ListNode temp = newHead;

        ListNode p1 = reverseList(l1);
        ListNode p2 = reverseList(l2);

        
        int carry = 0;
        while(p1!=null || p2!=null){
            int sum = 0;
            if(p1!=null){
                sum+=p1.val;
                p1 = p1.next;
            }
            if(p2!=null){
                sum+=p2.val;
                p2 = p2.next;
            }
            sum+=carry;

            carry = sum/10;

            ListNode newNode = new ListNode();
            newNode.val = sum%10;
            temp.next = newNode;
            temp = newNode;
            
        }

        if(carry!=0){
            ListNode newNode = new ListNode();
            newNode.val = 1;
            temp.next = newNode;
            temp = newNode;
            temp.next = null;
        }

        newHead = newHead.next;
        return reverseList(newHead);
    }
}
