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
public int getGCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;
        ListNode next;
        int gcd=0;
        while(current != null && current.next != null){
            next = current.next;
            gcd=getGCD(current.val, next.val);
            ListNode tem = new ListNode(gcd);
            current.next = tem;
            tem.next = next;
            current = next;
            next =current.next;
        }
        return head;
    }
}