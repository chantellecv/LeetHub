/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        return dfs(left, right);
    }

    public boolean dfs(TreeNode left, TreeNode right){
        if (left == null || right == null){
            return left == right;
        }
        return left.val == right.val && dfs(left.left, right.right) && dfs(left.right, right.left);
    }
}