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
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int depth = front(root, 0);
        return depth;
    }
    public int front(TreeNode root, int n) {
        ++ n;
        int min = n;
        if (root.left != null)
            min = front(root.left, n);
        if (root.right != null) {
            if (root.left == null)
                min = front(root.right, n);
            else
                min = Math.min(min, front(root.right, n));
        }
        return min;
    }
}