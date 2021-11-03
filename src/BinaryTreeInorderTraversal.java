import java.util.ArrayList;
import java.util.List;

/**
 * Problem 94.
 */
public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		traverse(root, list);
		return list;
	}

	private void traverse(TreeNode root, List<Integer> list) {
		if (root != null) {
			traverse(root.left, list);
			list.add(root.val);
			traverse(root.right, list);
		}
	}
}
