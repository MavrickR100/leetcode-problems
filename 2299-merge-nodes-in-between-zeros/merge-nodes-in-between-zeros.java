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

    public int  aggregateList(ListNode head, ListNode tail){
            ListNode current =head;
            int sum =0;
            while(current != tail){
                sum += current.val;
                current = current.next;
            }
            System.out.print("Sum:"+sum);
            return sum;
    }

    public ListNode mergeNodes(ListNode head) {
        ListNode firstZero = head;
        ListNode secondZero = null;
        ListNode current = head.next;
        
        while(current != null){
            if(current.val ==0){
                secondZero = current;
                ListNode tem = new ListNode(aggregateList(firstZero,secondZero));
                firstZero.next = tem;
                tem.next=secondZero;
                firstZero =secondZero;
            }
            current=current.next;
        }

        firstZero = head;
        head=head.next;
        current = head;
        
        while(current.next != null){
            if(current.next.val ==0){
                current.next=current.next.next;
            }
           System.out.print(current.val+" ");
            current=current.next;
            if(current == null) break;
        }

        return head;

        
    }
}