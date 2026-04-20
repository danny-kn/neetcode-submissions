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

// import java.util.StringBuilder;

class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode currNode = head;
        while (currNode != null) {
            sb.append(currNode.val);
            currNode = currNode.next;
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}