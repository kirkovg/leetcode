import java.util.LinkedList;

/**
 * Problem 225.
 */
public class MyStack {

	private final LinkedList<Integer> queue;

	/**
	 * Initialize your data structure here.
	 */
	public MyStack() {
		queue = new LinkedList<>();
	}

	/**
	 * Push element x onto stack.
	 */
	public void push(int x) {
		queue.addLast(x);
	}

	/**
	 * Removes the element on top of the stack and returns that element.
	 */
	public int pop() {
		return queue.removeLast();
	}

	/**
	 * Get the top element.
	 */
	public int top() {
		return queue.getLast();
	}

	/**
	 * Returns whether the stack is empty.
	 */
	public boolean empty() {
		return queue.isEmpty();
	}

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push(3);
		myStack.push(5);
		System.out.println(myStack.pop());
		System.out.println(myStack.top());
		System.out.println(myStack.empty());
	}
}