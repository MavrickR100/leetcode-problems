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
//  public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         List<Integer> listA = new ArrayList<>();
//         List<Integer> listB = new ArrayList<>();
//         ListNode currentA = headA;
//         ListNode currentB = headB;

//         while(currentA != null){
//             listA.add(currentA.val);
//             currentA =currentA.next;
//         }

//         while(currentB != null){
//             listB.add(currentB.val);
//             currentB =currentB.next;
//         }

//         System.out.print(listA+" ");
//         System.out.println();
//         System.out.print(listB+" ");

        
//         return headA;
//     }
// }
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;

        while(currentA != null){
            currentB =headB;

            while(currentB != null){
                if(currentA == currentB){
                    return currentA;
                }
                currentB =currentB.next;
            }
            currentA =currentA.next;
        }

        return null;
        
    }
}