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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null)
            return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        boolean flag;
        TreeNode T = root;
        TreeNode p = null;
        while (!stack.isEmpty()) {
            while (stack.peek() != null)
                stack.push(stack.peek().left);
            stack.pop();
            while (!stack.isEmpty()) {
                T = stack.peek();
                if (T.right == null || T.right == p) {
                    list.add(T.val);
                    stack.pop();
                    p = T;
                    flag = true;
                }
                else {
                    stack.push(T.right);
                    flag = false;
                }
                if (!flag)
                    break;
            }
        }
        return list;
    }
}