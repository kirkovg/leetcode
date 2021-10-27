import java.util.Arrays;

/**
 * Problem 75.
 */
public class SortColors {
	public void sortColors(int[] nums) {
		int countZeros = 0;
		int countOnes = 0;
		for (int num : nums) {
			if (num == 0) {
				countZeros++;
			} else if (num == 1) {
				countOnes++;
			}
		}

		for (int i = 0; i < countZeros; i++) {
			nums[i] = 0;
		}
		for (int i = countZeros; i < countZeros + countOnes; i++) {
			nums[i] = 1;
		}
		for (int i = countZeros + countOnes; i < nums.length; i++) {
			nums[i] = 2;
		}
	}

	public void sortColorsBubbleSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j  < nums.length; j++) {
				if (nums[j] > nums[i]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = {2, 0, 2, 1, 1, 0};
		new SortColors().sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
}
