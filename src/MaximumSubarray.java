/**
 * Problem 53.
 */
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int bestSum = nums[0];
		int currentSum = bestSum;
		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			bestSum = Math.max(bestSum, currentSum);
		}
		return bestSum;
	}

	public static void main(String[] args) {
		System.out.println(new MaximumSubarray().maxSubArray(new int[]{1}));
	}
}
