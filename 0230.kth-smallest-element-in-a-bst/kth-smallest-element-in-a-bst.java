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
    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return -1;
        inOrder(root);
        return list.get(k - 1);
    }
    public void inOrder(TreeNode root) {
        if (root.left != null)
            inOrder(root.left);
        list.add(root.val);
        if (root.right != null)
            inOrder(root.right);
    }
}