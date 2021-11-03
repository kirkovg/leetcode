import java.util.ArrayList;
import java.util.List;

/**
 * Problem 145.
 */
public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		traverse(root, list);
		return list;
	}

	private void traverse(TreeNode root, List<Integer> list) {
		if (root != null) {
			traverse(root.left, list);
			traverse(root.right, list);
			list.add(root.val);
		}
	}
}
