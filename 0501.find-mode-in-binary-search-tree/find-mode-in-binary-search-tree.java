/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[] a;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int x = 0; x < list.size(); x ++) {
        	int y = list.get(x);
        	map.put(y, map.getOrDefault(y, 1) + 1);
            if (map.get(y) > count) {
                l.clear();
                l.add(y);
                count = map.get(y);
            }
            else if (map.get(y) == count)
                l.add(y);
        }
        a = new int[l.size()];
        for (int x = 0; x < l.size(); x ++)
            a[x] = l.get(x);
        return a;
    }
    public void inOrder(TreeNode root) {
        if (root != null) {
        if (root.left != null)
            inOrder(root.left);
        list.add(root.val);
        if (root.right != null)
            inOrder(root.right);
        }
    }
}