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
    int res = 0;
    public int distributeCoins(TreeNode root) {
        postorder(root);
        return res;
    }
    private int postorder(TreeNode root){
        if (root == null){
            return 0;
        }
        int left = postorder(root.left);
        int right = postorder(root.right);
        res += Math.abs(left) + Math.abs(right);
        
        return root.val+left+right-1;
    }
}
