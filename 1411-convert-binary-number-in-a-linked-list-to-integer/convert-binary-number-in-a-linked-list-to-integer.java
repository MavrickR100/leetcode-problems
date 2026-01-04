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
    public int getDecimalValue(ListNode head) {
        ListNode currentNode =head;
        StringBuilder str = new StringBuilder();
        while(currentNode!=null){
            str.append(currentNode.val);
            currentNode=currentNode.next;
        }

        return Integer.parseInt(str.toString(),2);
        
    }
}