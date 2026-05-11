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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root,0);
        return result;
    }

    private void dfs(TreeNode node, int depth) {
        if(node == null) return;
        List<Integer> levelList = new ArrayList<>();

        if(result.size() == depth) result.add(levelList);

        result.get(depth).add(node.val);

        dfs(node.left, depth + 1);
        dfs(node.right, depth + 1);
    }
}
