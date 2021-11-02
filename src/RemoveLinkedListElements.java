/**
 * Problem 203.
 */
public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
			while (head != null && head.val == val) {
				head = head.next;
			}
			if (head == null) {
				return null;
			}
		ListNode tmp = head;
		while (tmp != null && tmp.next != null) {
			if (tmp.next.val == val) {
				tmp.next = tmp.next.next;
			} else {
				tmp = tmp.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
		ListNode result = new RemoveLinkedListElements().removeElements(head, 6);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

		head = new ListNode(7, new ListNode(7, new ListNode(7)));
		result = new RemoveLinkedListElements().removeElements(head, 7);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
