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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = list1;
        ListNode next = list1;
        ListNode endList2 = list2;

        // while (prev != null) {
        //     node++;
        //     if (node < a) {
        //         prev = prev.next;
        //     } else {
        //         break;
        //     }
        // }

        for(int i=1;i<a;i++){
            prev=prev.next;
        }

   
        next =prev;

        // while (next != null) {
        //     node++;
        //     if (node < b + 1) {
        //         next = next.next;
        //     } else {
        //         break;
        //     }
        // }

        for(int i=a;i<=b;i++){
            next=next.next;
        }

        while (endList2.next != null) {
            endList2 = endList2.next;
        }

        prev.next = list2;
        endList2.next = next.next;

        return list1;

    }
}