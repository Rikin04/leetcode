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
    ArrayList<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return list;
        inOrder(root);
        return list;
    }
    public void inOrder(TreeNode root) {
        if (root.left != null)
            inOrder(root.left);
        list.add(root.val);
        if (root.right != null)
            inOrder(root.right);
    }
}