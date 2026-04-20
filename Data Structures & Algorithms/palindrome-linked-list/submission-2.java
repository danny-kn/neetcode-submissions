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

// import java.util.Stack;

// import java.util.StringBuilder;

// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         List<Integer> list = new ArrayList<>();
//         ListNode currNode = head;
//         while (currNode != null) {
//             list.add(currNode.val);
//             currNode = currNode.next;
//         }
//         List<Integer> sortedList = sortAndReturn(list);
//         return list.equals(sortedList);
//     }

//     public List<Integer> sortAndReturn(List<Integer> list) {
//         List<Integer> newList = new ArrayList<>(list);
//         Collections.reverse(newList);
//         return newList;
//     }
// }

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode currNode = head;
        while (currNode != null) {
            stack.push(currNode);
            currNode = currNode.next;
        }
        if (stack.isEmpty()) { return false; }
        currNode = head;
        while (currNode != null) {
            if (currNode.val != stack.pop().val) {
                return false;
            }
            currNode = currNode.next;
        }
        return true;
    }
}

// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         StringBuilder sb = new StringBuilder();
//         ListNode currNode = head;
//         while (currNode != null) {
//             sb.append(currNode.val);
//             currNode = currNode.next;
//         }
//         return sb.toString().equals(sb.reverse().toString());
//     }
// }