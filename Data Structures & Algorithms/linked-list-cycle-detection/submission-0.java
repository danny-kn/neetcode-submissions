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

// import java.util.Set;
// import java.util.HashSet;

class Solution {
    public boolean hasCycle(ListNode head) {
        boolean containsCycle = false;
        Set<ListNode> set = new HashSet<>();
        ListNode currNode = head;
        while (currNode != null) {
            if (set.contains(currNode)) {
                containsCycle = true;
                return containsCycle;
            }
            set.add(currNode);
            currNode = currNode.next;
        }
        return containsCycle;
    }
}
