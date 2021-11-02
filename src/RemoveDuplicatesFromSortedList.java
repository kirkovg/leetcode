/**
 * Problem 83.
 */
public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		int currentVal = head.val;
		ListNode currentNode = head;
		while (currentNode != null && currentNode.next != null) {
			if (currentNode.next.val == currentVal) {
				currentNode.next = currentNode.next.next;
			} else {
				currentNode = currentNode.next;
				currentVal = currentNode.val;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
		ListNode result = new RemoveDuplicatesFromSortedList().deleteDuplicates(head);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

		System.out.println("-----------------------");

		head = new ListNode(1, new ListNode(1));
		result = new RemoveDuplicatesFromSortedList().deleteDuplicates(head);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

		System.out.println("-----------------------");

		head = new ListNode(1, new ListNode(2));
		result = new RemoveDuplicatesFromSortedList().deleteDuplicates(head);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

		System.out.println("-----------------------");
	}
}
