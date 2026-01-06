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
    public ListNode middleNode(ListNode head) {
        int size=0,k=0;

        ListNode current = head;

        while(current != null){
            size++;
            current=current.next;
        }
        current = head;
        while(k != (size/2)){
            k++;
            current =current.next;
        }
    

        return current;
        
    }
}