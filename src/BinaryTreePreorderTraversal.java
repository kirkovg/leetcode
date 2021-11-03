import java.util.ArrayList;
import java.util.List;

/**
 * Problem 144.
 */
public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		traverse(root, list);
		return list;
	}

	private void traverse(TreeNode root, List<Integer> list) {
		if (root != null) {
			list.add(root.val);
			traverse(root.left, list);
			traverse(root.right, list);
		}
	}
}
