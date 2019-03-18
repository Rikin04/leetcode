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
public TreeNode bstFromPreorder(int[] preorder) {
    TreeNode root = new TreeNode(preorder[0]);
    int index = 1;
    for (;index < preorder.length; index ++) 
        if (preorder[index] > preorder[0]) break;
    if (index - 1 > 0) {
        int[] left = new int[index - 1];
        for (int i = 1; i < index; i ++)
            left[i - 1] = preorder[i];
        root.left = bstFromPreorder(left);
    }
    if (index < preorder.length) {
        int[] right = new int[preorder.length - index];
        for (int i = 0; i < right.length; i ++)
            right[i] = preorder[index + i];
        root.right = bstFromPreorder(right);
    }
    return root;
}
}