/**
 * Problem 35.
 */
class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		return binarySearch(nums, 0, nums.length - 1, target);
	}

	public int binarySearch(int[] nums, int start, int end, int target) {
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
		return start;
	}

	public static void main(String[] args) {
		System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 5, 6}, 0));
	}
}