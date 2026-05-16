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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inorder(root, result);
        return inOrderLoop(root);
    }

    public void inorder(TreeNode node, List<Integer> result) {
        if(node == null) return;

        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }

    public List<Integer> inOrderLoop(TreeNode root) {
        TreeNode curr = root;
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<>();
        while(curr != null || !st.isEmpty()) {
            while(curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        return result;
    }
}