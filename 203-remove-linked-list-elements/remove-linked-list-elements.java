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
    public ListNode removeElements(ListNode head, int val) {
        ListNode previous = null;
        ListNode current = head;
        while(current != null){
            
            if(current.val == val){
                if(current == head){
                    head= head.next;
                    current = head;
                }else{
                previous.next = current.next;
                current.next = null;
                current = previous.next;
                }

            }else{
            previous = current;
            current =current.next;
            }
        }
        return head;
    }
}