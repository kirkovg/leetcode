
/**
 * Problem 206.
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode prev = null;
		ListNode current = head;
		while (current != null) {
			ListNode tmp = current.next;
			current.next = prev;
			prev = current;
			current = tmp;
		}
		return prev;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
		ListNode result = new ReverseLinkedList().reverseList(head);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}
	}
}
