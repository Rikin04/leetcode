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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list = new ArrayList<Double>();
        if (root == null)
            return list;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            double sum = 0;
            TreeNode T;
            for (int i = 0; i < n; i ++) {
                T = q.poll();
                sum += T.val;
                if (T.left != null) q.add(T.left);
                if (T.right != null) q.add(T.right);
            }
            list.add(sum / n);
        }
        return list;
    }
}