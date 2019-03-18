/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int depth = front(root, 0);
        return depth;
    }
    public int front(TreeNode root, int n) {
        ++ n;
        int max = n;
        if (root.left != null)
            max = front(root.left, n);
        if (root.right != null)
            max = Math.max(max, front(root.right, n));
        return max;
    }
}