/**
 * Problem 74.
 */
public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		for (int i = 0; i < rows; i++) {
			int start = matrix[i][0];
			int end = matrix[i][cols - 1];
			if (start == target || end == target) {
				return true;
			} else if (start < target && target < end) {
				return binarySearch(matrix[i], 0, matrix[i].length - 1, target);
			}
		}

		return false;
	}

	private boolean binarySearch(int[] nums, int start, int end, int target) {
		if (start <= end) {
			int middle = start + (end - start) / 2;
			if (nums[middle] == target) {
				return true;
			}
			if (nums[middle] > target) {
				return binarySearch(nums, start, middle - 1, target);
			}
			return binarySearch(nums, middle + 1, end, target);
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][] {
			new int[] {1,3,5,7},
			new int[] {10,11,16,20},
			new int[] {23,30,34,60},
		};

		System.out.println(new SearchA2DMatrix().searchMatrix(matrix, 13));
	}
}
