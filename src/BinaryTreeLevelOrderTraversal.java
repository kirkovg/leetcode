import java.util.ArrayList;
import java.util.List;

/**
 * Problem 102.
 */
public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		traverseInLevelOrder(root, result, 0);
		return result;
	}

	private void traverseInLevelOrder(TreeNode root,
																		List<List<Integer>> result,
																		int depth) {
		if (root != null) {
			if (result.size() > depth) {
				result.get(depth).add(root.val);
			} else {
				List<Integer> subList = new ArrayList<>();
				subList.add(root.val);
				result.add(subList);
			}
			traverseInLevelOrder(root.left, result, depth + 1);
			traverseInLevelOrder(root.right, result, depth + 1);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

		List<List<Integer>> result = new BinaryTreeLevelOrderTraversal().levelOrder(root);
		for (List<Integer> integers : result) {
			System.out.println(integers.toString());
		}
	}
}
