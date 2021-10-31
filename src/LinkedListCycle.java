import java.util.HashSet;
import java.util.Set;

/**
 * Problem 141.
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		Set<ListNode> alreadyVisited = new HashSet<>();

		ListNode tmp = head;
		while (tmp != null) {
			if (alreadyVisited.contains(tmp)) {
				return true;
			}
			alreadyVisited.add(tmp);
			tmp = tmp.next;
		}

		return false;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2, head);
		System.out.println(new LinkedListCycle().hasCycle(head));
	}
}
