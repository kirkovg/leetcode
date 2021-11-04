/**
 * Problem 404.
 */
public class SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left != null && root.left.left == null && root.left.right == null) {
			return root.left.val + sumOfLeftLeaves(root.right);
		}

		return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

		System.out.println(new SumOfLeftLeaves().sumOfLeftLeaves(root));
	}
}
