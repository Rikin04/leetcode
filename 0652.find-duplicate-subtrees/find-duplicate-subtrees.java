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
    LinkedList<TreeNode> list = new LinkedList<TreeNode>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        LinkedList<TreeNode> l = new LinkedList<TreeNode>();
        HashMap<String, TreeNode> m = new HashMap<String, TreeNode>();
        if (root == null)
            return l;
        front(root, m);
        for (String key : m.keySet()) {
            if (m.get(key) != null)
                l.add(m.get(key));
        }
        return l;
    }
    public String front(TreeNode root, HashMap<String, TreeNode> m) {
        if (root == null) return " ";
        String str = root.val + front(root.left, m) + front(root.right, m);
        if (m.containsKey(str))
            m.put(str, root);
        else
            m.put(str, null);
        return str;
    }
}