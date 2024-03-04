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
    int value,count=0;
    public int kthSmallest(TreeNode root, int k) {
         return small( root,k);
    }
    private int small(TreeNode curr, int k){
        if(curr==null){
            return 0;
        }
    small(curr.left,k);
    count++;
    if(count==k){
        value= curr.val;
    }
    small(curr.right,k);
    return value;
    }
}