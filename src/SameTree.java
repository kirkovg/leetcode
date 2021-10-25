import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Problem 100.
 */
public class SameTree {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    List<Integer> pValues = new ArrayList<>();
    List<Integer> qValues = new ArrayList<>();

    traverse(p, 0, pValues);
    traverse(q, 0, qValues);

    if (pValues.size() != qValues.size()) {
      return false;
    }
    for (int i = 0; i < pValues.size(); i++) {
      if (!Objects.equals(pValues.get(i), qValues.get(i))) {
        return false;
      }
    }
    return true;
  }

  private void traverse(TreeNode currentNode, int level, List<Integer> values) {
    if (currentNode != null) {
      values.add(currentNode.val);
      traverse(currentNode.left, level + 1, values);
      traverse(currentNode.right, level + 1, values);
    } else {
      values.add(null);
    }
  }

  public static void main(String[] args) {
    TreeNode p = new TreeNode();
    p.val = 1;
    p.left = new TreeNode(2);
    p.right = null;

    TreeNode q = new TreeNode();
    q.val = 1;
    q.left = null;
    q.right = new TreeNode(2);

    System.out.println(new SameTree().isSameTree(p, q));
  }
}
