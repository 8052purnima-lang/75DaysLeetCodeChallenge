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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root== null)
           return false;

        return areTreesEqual(root, subRoot)|| isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }
    boolean areTreesEqual(TreeNode a, TreeNode b) {
        if(a == null && b == null)
          return true;
        else if (a == null || b == null )
          return false ;
        else 
          return a.val == b.val && areTreesEqual(a.left, b.left) && areTreesEqual(a.right, b.right);

    }
};