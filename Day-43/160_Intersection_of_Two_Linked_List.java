/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int findLength(ListNode head){
        if(head==null){
            return 0;
        }

        int count = 1;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }

        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = findLength(headA);
        int lenB = findLength(headB);

        ListNode p1 = headA;
        ListNode p2 = headB;

        if(lenA>lenB){
            int diff = lenA - lenB;

            while(diff>0){
                p1 = p1.next;
                diff--;
            }
        }
        else if(lenB>lenA){
            int diff = lenB - lenA;

            while(diff>0){
                p2 = p2.next;
                diff--;
            }
        }

        while(p1!=null && p2!=null){
            if(p1==p2){
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return null;
    }
}
