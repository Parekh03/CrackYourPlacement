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
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)  
            return true;
        ListNode firstHead = head;
        ListNode middle = findMiddle(head);
        ListNode secondHead = middle.next;

        middle.next = null;

        secondHead = reverseList(secondHead);

        ListNode p1 = firstHead;
        ListNode p2 = secondHead;

        while(p1!=null && p2!=null){
            if(p1.val!=p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}
