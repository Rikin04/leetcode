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
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode copy = null;
        copy = invert(root, copy);
        return copy;
    }
    public TreeNode invert(TreeNode root, TreeNode copy) {
        copy = new TreeNode(root.val);
        if (root.right != null)
            copy.left = new TreeNode(root.right.val);
        if (root.left != null)
            copy.right = new TreeNode(root.left.val);
        if (copy.left != null)
            copy.left = invert(root.right, copy.left);
        if (copy.right != null)
            copy.right = invert(root.left, copy.right);
        return copy;
    }
}