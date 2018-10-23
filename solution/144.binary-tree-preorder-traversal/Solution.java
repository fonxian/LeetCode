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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root != null){
            traversal(root,list);
        }
        return list;
    }

    public void traversal(TreeNode root,List<Integer> list){

        if(root == null){
            return ;
        }

        list.add(root.val);
        
        if(root.left != null){
            traversal(root.left,list);
        }
        if(root.right != null){
            traversal(root.right,list);
        }
    }
    
}