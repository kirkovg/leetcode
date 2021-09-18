import java.util.Arrays;

/**
 * Problem 977.
 */
public class SquareOfASortedArray {
	public int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}

	public static void main(String[] args) {
		Arrays.stream(new SquareOfASortedArray().sortedSquares(new int[]{-4, -1, 0, 3, 10}))
			.forEach(System.out::println);
	}
}
