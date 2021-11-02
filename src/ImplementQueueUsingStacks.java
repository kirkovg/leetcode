import java.util.Stack;

/**
 * Problem 232.
 */
public class ImplementQueueUsingStacks {
	private Stack<Integer> first;
	private Stack<Integer> second;

	public ImplementQueueUsingStacks() {
		first = new Stack<>();
		second = new Stack<>();
	}

	public void push(int x) {
		while (!first.isEmpty()) {
			second.push(first.pop());
		}
		first.push(x);
		while (!second.isEmpty()) {
			first.push(second.pop());
		}
	}

	public int pop() {
		return first.pop();
	}

	public int peek() {
		return first.peek();
	}

	public boolean empty() {
		return first.isEmpty();
	}
}
