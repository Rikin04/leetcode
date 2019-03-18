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
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        boolean b = balanced(root.left, root.right);
        return b;
    }
    public boolean balanced(TreeNode left, TreeNode right) {
        int ld = 0, rd = 0;
        boolean bo;
        if (left != null)
            ld = front(left, 0);
        if (right != null)
            rd = front(right, 0);
        if (Math.abs(ld - rd) <= 1)
            bo = true;
        else
            bo = false;
        if (bo) {
            if (left != null)
                bo = balanced(left.left, left.right);
            if (bo && right != null)
                bo = balanced(right.left, right.right);
        }
        return bo;
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