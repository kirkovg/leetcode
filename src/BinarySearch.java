/**
 * Problem 704.
 */
public class BinarySearch {

	public int search(int[] nums, int target) {
		return binarySearch(nums, 0, nums.length - 1, target);
	}

	private int binarySearch(int[] nums, int start, int end, int target) {
		if (start <= end) {
			int middle = start + (end - start) / 2;
			if (nums[middle] == target) {
				return middle;
			}
			if (nums[middle] > target) {
				return binarySearch(nums, start, middle - 1, target);
			}
			return binarySearch(nums, middle + 1, end, target);
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(new BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
	}
}
