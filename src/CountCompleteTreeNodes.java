/**
 * Problem 222.
 */
public class CountCompleteTreeNodes {
	Integer count = 0;

	public int countNodes(TreeNode root) {
		countNodes2(root);
		return count;
	}

	public void countNodes2(TreeNode root) {
		if (root != null) {
			count++;
		}
		if (root != null && root.left != null) {
			countNodes2(root.left);
		}
		if (root != null && root.right != null) {
			countNodes2(root.right);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode three = new TreeNode(3);
		three.left = new TreeNode(6);
		root.right = three;

		TreeNode two = new TreeNode(2);
		two.left = new TreeNode(4);
		two.right = new TreeNode(5);
		root.left = two;
		System.out.println(new CountCompleteTreeNodes().countNodes(root));
	}
}



