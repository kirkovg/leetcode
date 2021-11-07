/**
 * Problem 700.
 */
public class SearchInABinaryTree {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return null;
		}
		if (root.val == val) {
			return root;
		}
		if (root.val > val) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}
	}

	public static void main(String[] args) {
		TreeNode head = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
		TreeNode x = new SearchInABinaryTree().searchBST(head, 5);
		System.out.println(x.val);
	}
}
