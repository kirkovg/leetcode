import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Problem 993.
 */
public class CousinsInBinaryTree {
	static class TreeNodeInfo {
		Integer parentValue;
		Integer depth;

		public TreeNodeInfo(Integer parentValue, Integer depth) {
			this.parentValue = parentValue;
			this.depth = depth;
		}
	}

	Map<Integer, TreeNodeInfo> mapping = new HashMap<>();

	public boolean isCousins(TreeNode root, int x, int y) {
		traverseTree(root, null, 0);
		TreeNodeInfo treeNodeInfoX = mapping.get(x);
		TreeNodeInfo treeNodeInfoY = mapping.get(y);
		return Objects.equals(treeNodeInfoX.depth, treeNodeInfoY.depth)
			&& !Objects.equals(treeNodeInfoX.parentValue, treeNodeInfoY.parentValue);
	}

	private void traverseTree(TreeNode currentNode, TreeNode parent, int depth) {
		if (currentNode != null) {
			depth++;
			mapping.put(currentNode.val, new TreeNodeInfo(parent != null ? parent.val : null, depth));
			traverseTree(currentNode.left, currentNode, depth);
			traverseTree(currentNode.right, currentNode, depth);
		}
	}
}
