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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root == null);
        else {
            list = (ArrayList<List<Integer>>)pathSumII(root, sum);
            if (list != null)
                for (int i = 0; i < list.size(); i ++) {
                    list.get(i).remove(0);
                    list.get(i).add(root.val);
            }
            for (int i = 0; i < list.size(); i ++) {
                for (int x = 0; x < list.get(i).size(); x ++) {
                    list.get(i).add(list.get(i).size() - x, list.get(i).get(0));
                    list.get(i).remove(0);
                }
            }
            
        }
        return list;
    }
    public List<List<Integer>> pathSumII(TreeNode root, int sum) {
        ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root.left == null && root.right == null) {
            if (root.val == sum) {
                ArrayList<Integer> l = new ArrayList<Integer>();
                l.add(root.val);
                list.add(l);
            }
            return list;
        }
        if (root.left != null) {
            ArrayList<List<Integer>> l = (ArrayList<List<Integer>>)pathSumII(root.left, sum - root.val);
            if (l != null) {
                for (int i = 0; i < l.size(); i ++)
                    l.get(i).add(root.left.val);
                list.addAll(l);
            }
        }
        if (root.right != null) {
            ArrayList<List<Integer>> l = (ArrayList<List<Integer>>)pathSumII(root.right, sum - root.val);
            if (l != null) {
                for (int i = 0; i < l.size(); i ++)
                    l.get(i).add(root.right.val);
                list.addAll(l);
            }
        }
        return list;
    }
}