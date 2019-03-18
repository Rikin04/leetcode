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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
        if (root == null)
            return list;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Stack<LinkedList<Integer>> s = new Stack<LinkedList<Integer>>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            TreeNode T;
            LinkedList<Integer> l = new LinkedList<Integer>();
            for (int x = 0; x < n; x ++) {
                T = q.poll();
                if (T.left != null) q.add(T.left);
                if (T.right != null) q.add(T.right);
                l.add(T.val);
            }
            s.push(l);
        }
        while (!s.isEmpty())
            list.add(s.pop());
        return list;
    }
}