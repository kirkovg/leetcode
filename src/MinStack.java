import java.util.*;

/**
 * Problem 155.
 */
public class MinStack {
	private LinkedList<Integer> values;
	private Integer min;

	public MinStack() {
		values = new LinkedList<>();
		min = Integer.MAX_VALUE;
	}

	public void push(int val) {
		if (val <= min) {
			min = val;
		}
		values.push(val);
	}

	public void pop() {
		values.pop();
		if (values.isEmpty()) {
			min = Integer.MAX_VALUE;
			return;
		}
		min = Collections.min(values);
	}

	public int top() {
		return values.getFirst();
	}

	public int getMin() {
		return min;
	}
}