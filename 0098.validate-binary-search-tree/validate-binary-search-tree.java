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
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        inOrder(root);
        for (int i = 0; i < list.size() - 1; i ++)
            if (list.get(i) >= list.get(i + 1))
                return false;
        return true;
    }
    public void inOrder(TreeNode root) {
        if (root.left != null)
            inOrder(root.left);
        list.add(root.val);
        if (root.right != null)
            inOrder(root.right);
    }
}