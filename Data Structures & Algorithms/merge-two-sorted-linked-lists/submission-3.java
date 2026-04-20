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

// import java.util.PriorityQueue;

// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//         ListNode currNode = list1;
//         while (currNode != null) {
//             minHeap.add(currNode.val);
//             currNode = currNode.next;
//         }
//         currNode = list2;
//         while (currNode != null) {
//             minHeap.add(currNode.val);
//             currNode = currNode.next;
//         }
//         if (minHeap.isEmpty()) { return null; }
//         ListNode newHead = new ListNode(minHeap.remove());
//         currNode = newHead;
//         while (!minHeap.isEmpty()) {
//             currNode.next = new ListNode(minHeap.remove());
//             currNode = currNode.next;
//         }
//         currNode.next = null;
//         return newHead;
//     }
// }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        populateMinHeap(minHeap, list1);
        populateMinHeap(minHeap, list2);
        if (minHeap.isEmpty()) { return null; }
        ListNode newHead = new ListNode(minHeap.remove());
        ListNode currNode = newHead;
        while (!minHeap.isEmpty()) {
            currNode.next = new ListNode(minHeap.remove());
            currNode = currNode.next;
        }
        currNode.next = null;
        return newHead;
    }

    public void populateMinHeap(PriorityQueue<Integer> minHeap, ListNode list) {
        ListNode currNode = list;
        while (currNode != null) {
            minHeap.add(currNode.val);
            currNode = currNode.next;
        }
    }
}