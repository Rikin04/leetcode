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
    int secondMin = Integer.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null)
            return -1;
        if (root.left == null)
            return -1;
        if (root.left.val < root.right.val) {
            if (secondMin > root.right.val)
                secondMin = root.right.val;
            findSecondMinimumValue(root.left);
        }
        else if (root.left.val > root.right.val) {
            if (secondMin > root.left.val)
                secondMin = root.left.val;
            findSecondMinimumValue(root.right);
        }
        else {
            findSecondMinimumValue(root.left);
            findSecondMinimumValue(root.right);
        }
        if (secondMin == Integer.MAX_VALUE)
            return -1;
        return secondMin;
    }
}