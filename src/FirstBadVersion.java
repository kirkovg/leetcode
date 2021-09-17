import java.util.Random;

/**
 * Problem 278.
 */
public class FirstBadVersion {
	public int firstBadVersion(int n) {
		int start = 1;
		int end = n;
		while (start < end) {
			int middle = start + (end - start) / 2;
			if (isBadVersion(middle)) {
				end = middle;
			} else {
				start = middle;
			}
		}
		return start;
	}

	public static boolean isBadVersion(int n) {
		// just for testing
		return new Random().nextBoolean();
	}
}