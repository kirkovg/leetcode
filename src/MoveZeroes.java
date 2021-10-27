import java.util.Arrays;

/**
 * Problem 283.
 */
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int nonZeroNumberIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[nonZeroNumberIndex] = nums[i];
				nonZeroNumberIndex++;
			}
		}
		for (int i = nonZeroNumberIndex; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[]{0, 1};
		new MoveZeroes().moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
}
