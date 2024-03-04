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
    public List<TreeNode> generateTrees(int n) {
        return generateTreesinRange(1,n);
    }
    private List<TreeNode> generateTreesinRange(int start,int end){
        List<TreeNode> trees=new ArrayList<>();
        if(start>end){
            trees.add(null);
        }
        for(int root=start;root<=end;root++){
            List<TreeNode> leftsub=generateTreesinRange(start,root-1);
            List<TreeNode> rightsub=generateTreesinRange(root+1,end);
            for(TreeNode left:leftsub){
                for(TreeNode right:rightsub){
                    TreeNode rootval=new TreeNode(root,left,right);
                    trees.add(rootval);
                }
            }
        }
        return trees;
    }
}