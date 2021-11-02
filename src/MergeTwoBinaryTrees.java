/**
 * Problem 617.
 */
public class MergeTwoBinaryTrees {
	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return null;
		}
		if (root1 != null && root2 == null) {
			return root1;
		}
		if (root1 == null && root2 != null) {
			return root2;
		}

		root1.val = root1.val + root2.val;
		root1.right = mergeTrees(root1.right, root2.right);
		root1.left = mergeTrees(root1.left, root2.left);
		return root1;
	}

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		TreeNode root1Left = new TreeNode(3);
		root1Left.left = new TreeNode(5);
		root1.left = root1Left;
		root1.right = new TreeNode(2);

		TreeNode root2 = new TreeNode(2);
		TreeNode root2Left = new TreeNode(1);
		root2Left.right = new TreeNode(4);
		root2.left = root2Left;
		TreeNode root2Right = new TreeNode(3);
		root2Right.right = new TreeNode(7);
		root2.right = root2Right;

		TreeNode result = new MergeTwoBinaryTrees().mergeTrees(root1, root2);
		System.out.println(result);
	}
}
