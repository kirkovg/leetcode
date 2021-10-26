import java.util.Arrays;

/**
 * Problem 189.
 */
public class RotateArray {
	public void rotate(int[] nums, int k) {
		int[] temp = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			temp[(i + k) % nums.length] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = temp[i];
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6,7};
		new RotateArray().rotate(nums, 3);
		System.out.println(Arrays.toString(nums));
	}
}
