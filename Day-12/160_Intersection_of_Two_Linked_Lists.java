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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> map = new HashMap<>();

        ListNode a = headA;
        ListNode b = headB;

        while(a!=null){
            map.put(a, a.val);
            a = a.next;
        }

        while(b!=null){
            if(map.containsKey(b)){
                return b;
            }
            b = b.next;
        }

        return null;
    }
}
