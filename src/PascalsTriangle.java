import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;

/**
 * Problem 118.
 */
public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		if (numRows == 0) {
			return result;
		}
		result.add(singletonList(1));

		for (int i = 1; i < numRows; i++) {
			List<Integer> current = new ArrayList<>();
			List<Integer> previous = result.get(i - 1);
			current.add(1);
			for (int j = 1; j < i; j++) {
				current.add(previous.get(j - 1) + previous.get(j));
			}
			current.add(1);
			result.add(current);
		}
		return result;
	}

	public static void main(String[] args) {
		List<List<Integer>> result = new PascalsTriangle().generate(5);
		for (List<Integer> integers : result) {
			System.out.println(integers.toString());
		}
	}
}
