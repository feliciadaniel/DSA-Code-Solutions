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
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        greater(root);
        return root;
    }
    private void greater(TreeNode curr){
        if(curr==null){
            return;
        }
        greater(curr.right);
        curr.val+=sum;
        sum=curr.val;
        greater(curr.left);
    }
}