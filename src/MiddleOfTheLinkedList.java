/**
 * Problem 876.
 */
public class MiddleOfTheLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode tmp = head.next;
		int size = 1;
		while (tmp != null) {
			tmp = tmp.next;
			size++;
		}
		int half = size / 2;
		while (half != 0) {
			head = head.next;
			half--;
		}
		return head;
	}
}
