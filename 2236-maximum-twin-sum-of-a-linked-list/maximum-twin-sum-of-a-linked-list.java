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
    public int pairSum(ListNode head) {
        ListNode current1 = head;
        int size=0;

        while(current1 != null){
            size ++;
            current1 = current1.next;
        }
        current1 =head;

        for(int i=0;i<size/2-1;i++){
            current1=current1.next;
        }
        ListNode current2 = current1.next;
        current1.next=null;
        current1 = head;
        
        
        ListNode prev = null;
        ListNode next = null;

        while(current2 != null){
            next = current2.next;
            current2.next = prev;
            prev = current2;
            current2 = next;
        }
        current2 = prev;
        size=0;

        while(current2 != null && current1 != null){
        
        if(current2.val + current1.val > size){
            size = current2.val + current1.val;
        }
        current1=current1.next;
        current2=current2.next;
        }


        return size;
        
    }
}