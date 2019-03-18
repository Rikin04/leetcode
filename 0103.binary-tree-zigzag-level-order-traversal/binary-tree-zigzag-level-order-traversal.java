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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<List<Integer>> list = new LinkedList<>();
        if (root == null)
            return list;
        boolean b = false;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            LinkedList<Integer> l = new LinkedList<Integer>();
            TreeNode T;
            for (int x = 0; x < n; x ++) {
                T = q.poll();
                if (T.left != null) q.add(T.left);
                if (T.right != null) q.add(T.right);
                l.add(T.val);
            }
           if (b) {
                int m = l.size();
                for (int x = 0; x < m; x ++) {
                    l.add(m - x, l.get(0));
                    l.remove(0);
                }
            }
            b = !b;
            list.add(l);
        }
        return list;
    }
}