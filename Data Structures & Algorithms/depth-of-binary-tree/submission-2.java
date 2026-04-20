/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// import java.util.Queue;
// import java.util.LinkedList;

// class Solution {
//     public int maxDepth(TreeNode root) {
//         if (root == null) { return 0; }
//         int leftSubtreeDepth = maxDepth(root.left);
//         int rightSubtreeDepth = maxDepth(root.right);
//         return 1 + Math.max(leftSubtreeDepth, rightSubtreeDepth);
//     }
// }

class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) { q.add(root); }
        int ct = 0;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                if (node.left != null) { q.add(node.left); }
                if (node.right != null) { q.add(node.right); }
            }
            ct++;
        }
        return ct;
    }
}