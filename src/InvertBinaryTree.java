/**
 * Problem 226.
 */
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		invertTreeInternal(root);
		return root;
	}

	private void invertTreeInternal(TreeNode root) {
		if (root != null) {
			TreeNode temp = root.right;
			root.right = root.left;
			root.left = temp;
			invertTreeInternal(root.right);
			invertTreeInternal(root.left);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		TreeNode two = new TreeNode(2);
		two.left = new TreeNode(1);
		two.right = new TreeNode(3);
		root.right = two;

		TreeNode seven = new TreeNode(7);
		seven.left = new TreeNode(6);
		seven.right = new TreeNode(9);
		root.left = seven;

		TreeNode inverted = new InvertBinaryTree().invertTree(root);
		System.out.println(inverted);
	}
}
