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
        HashMap<Integer, Integer> map = new HashMap<>();

        ListNode temp = head;
        while(temp!=null){
            int freq = map.getOrDefault(temp.val,0);
            map.put(temp.val, freq+1);

            temp = temp.next;
        }

        ListNode newHead = new ListNode();
        newHead.next = head;
        ListNode prev = newHead;
        ListNode curr = head;

        while(curr!=null){
            int freq = map.get(curr.val);

            if(freq>1){ // duplicate
                ListNode nxt = curr.next;
                prev.next = nxt;
                curr = nxt;
            }
            else{
                ListNode nxt = curr.next;
                prev = curr;
                curr = nxt;
            }
        }

        return newHead.next;
    }
}
