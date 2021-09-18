import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem 1.
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int difference = target - num;
			if (map.containsKey(difference)) {
				int index = map.get(difference);
				if (index != i) {
					return new int[] {i, index};
				}
			}
		}
		return null;
	}

	public int[] twoSumBruteForce(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target && i != j) {
					return new int[]{i, j};
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new TwoSum().twoSumBruteForce(new int[]{3,3}, 6)));
		System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{3,3}, 6)));
	}
}
