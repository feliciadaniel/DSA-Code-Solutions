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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1= new ArrayList<>();
        List<Integer> l2= new ArrayList<>();
        inorder(root1,l1);
        inorder(root2,l2);
        return merged(l1,l2);
    }
    private void inorder(TreeNode root,List<Integer> list){
        if(root==null){
            return ;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    private List<Integer> merged(List<Integer> l1,List<Integer> l2){
        List<Integer>sorted= new ArrayList<>();
        int i=0,j=0;
        while(i<l1.size() && j<l2.size()){
            if(l1.get(i)<=l2.get(j)){
                sorted.add(l1.get(i++));
            }
            else{
                sorted.add(l2.get(j++));
            }
        }
        while(i<l1.size()){
            sorted.add(l1.get(i++));
        }
        while(j<l2.size()){
            sorted.add(l2.get(j++));
        }
        return sorted;
    }
}