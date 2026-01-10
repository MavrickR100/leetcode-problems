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
        Stack<Integer> stack = new Stack<>();
        while(current1 != null){
            size ++;
            current1 = current1.next;
        }
        current1 =head;
        for(int i=0;i<size/2;i++){
            stack.push(current1.val);
            current1=current1.next;
        }
        ListNode current2 = current1;
        size=0;
        while(current2 != null){
            int t = stack.pop()+current2.val;
            if( t > size){
                size = t;
            }
            current2 = current2.next;
        }
        return size;
        
    }
}