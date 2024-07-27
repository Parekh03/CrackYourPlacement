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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
            return null;
        
        if(list1==null)
            return list2;
        
        if(list2 == null)
            return list1;
        
        ListNode newHead = new ListNode();
        ListNode temp = newHead;

        ListNode p1 = list1;
        ListNode p2 = list2;

        while(p1!=null && p2!=null){
            if(p1.val <= p2.val){
                ListNode t = new ListNode();
                t.val = p1.val;

                temp.next = t;
                temp = t;

                p1 = p1.next;
            }

            else{
                ListNode t = new ListNode();
                t.val = p2.val;

                temp.next = t;
                temp = t;

                p2 = p2.next;
            }
        }

        while(p1!=null){
            ListNode t = new ListNode();
            t.val = p1.val;

            temp.next = t;
            temp = t;

            p1 = p1.next;
        }

        while(p2!=null){
            ListNode t = new ListNode();
            t.val = p2.val;

            temp.next = t;
            temp = t;

            p2 = p2.next;
        }

        return newHead.next;
    }
}
