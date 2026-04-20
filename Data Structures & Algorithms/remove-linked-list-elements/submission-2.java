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

// import java.util.List;
// import java.util.ArrayList;

// class Solution {
//     public ListNode removeElements(ListNode head, int val) {
//         List<ListNode> list = new ArrayList<>();
//         ListNode currNode = head;
//         while (currNode != null) {
//             if (currNode.val != val) {
//                 list.add(currNode);
//             }
//             currNode = currNode.next;
//         }
//         if (list.isEmpty()) { return null; }
//         ListNode newHead = list.removeFirst();
//         currNode = newHead;
//         while (!list.isEmpty()) {
//             currNode.next = list.removeFirst();
//             currNode = currNode.next;
//         }
//         currNode.next = null;
//         return newHead;
//     }
// }

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        List<Integer> list = new ArrayList<>();
        ListNode currNode = head;
        while (currNode != null) {
            if (currNode.val != val) {
                list.add(currNode.val);
            }
            currNode = currNode.next;
        }
        if (list.isEmpty()) { return null; }
        ListNode newHead = new ListNode(list.removeFirst());
        currNode = newHead;
        while (!list.isEmpty()) {
            currNode.next = new ListNode(list.removeFirst());
            currNode = currNode.next;
        }
        currNode.next = null;
        return newHead;
    }
}