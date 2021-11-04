/**
 * Problem 104.
 */
public class MaximumDepthOfBinaryTree {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

		System.out.println(new MaximumDepthOfBinaryTree().maxDepth(root));
	}
}
