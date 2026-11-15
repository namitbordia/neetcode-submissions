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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> t = new LinkedList<>();
        helper(root,t);
        return t;
    }
    public void helper(TreeNode root , List<List<Integer>> t){
        if(root == null) return;
        Queue <TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> sublist = new LinkedList<>();
            int levelnum = q.size();
            for(int i = 0;i<levelnum;i++){
                TreeNode node = q.poll();
                sublist.add(node.val);
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            t.add(sublist);
        }

    }
}
