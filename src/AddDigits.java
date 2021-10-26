import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem 258.
 */
public class AddDigits {

	private List<Integer> getDigits(int n) {
		if (n == 0) {
			return Collections.singletonList(0);
		}
		List<Integer> digits = new ArrayList<>();
		while (n != 0) {
			digits.add(n % 10);
			n = n / 10;
		}
		return digits;
	}


	private Integer getDigitsSum(List<Integer> digits) {
		return digits.stream().reduce(0, Integer::sum);
	}

	public int addDigits(int num) {
		int digitCount = -1;
		List<Integer> digits;
		do {
			digits = getDigits(num);
			digitCount = digits.size();
			num = getDigitsSum(digits);
		} while (digitCount != 1);
		return digits.get(0);
	}

	public static void main(String[] args) {
		System.out.println(new AddDigits().addDigits(0));
	}
}
