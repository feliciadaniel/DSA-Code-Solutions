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
    int [] arr = new int [10000];
    int count=0;
    public TreeNode balanceBST(TreeNode root) {
        inorder(root,arr);
        return balance(arr,0,count-1);
    }
    private void inorder(TreeNode root,int[] arr){
        if(root!=null){
            inorder(root.left,arr);
            arr[count++]=root.val;
            inorder(root.right,arr);
        }
    }
    private TreeNode balance(int[] arr,int left,int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode roott = new TreeNode(arr[mid]);
        roott.left=balance(arr,left,mid-1);
        roott.right=balance(arr,mid+1,right);
        return roott;
    }
}