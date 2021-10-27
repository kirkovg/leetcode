import java.util.Arrays;

/**
 * Problem 167. Input array is sorted.
 */
public class TwoSum2 {
	public int[] twoSum(int[] numbers, int target) {
		// since it is sorted we can search it with binary search
		int start = 0;
		int end = numbers.length - 1;
		while (start < end) {
			if (numbers[start] + numbers[end] > target) {
				end--;
			} else if (numbers[start] + numbers[end] < target) {
				start++;
			} else {
				return new int[]{start + 1, end + 1};
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new TwoSum2().twoSum(new int[]{2, 7, 11, 15}, 9)));
	}
}
