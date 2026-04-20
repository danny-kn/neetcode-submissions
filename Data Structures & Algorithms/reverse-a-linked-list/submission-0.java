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

// import java.util.Stack;

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode currNode = head;
        while (currNode != null) {
            stack.push(currNode);
            currNode = currNode.next;
        }
        if (stack.isEmpty()) { return null; }
        ListNode newHead = stack.pop();
        currNode = newHead;
        while (!stack.isEmpty()) {
            currNode.next = stack.pop();
            currNode = currNode.next;
        }
        currNode.next = null;
        return newHead;
    }
}
