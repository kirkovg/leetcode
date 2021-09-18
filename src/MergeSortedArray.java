import java.util.Arrays;

/**
 * Problem 88.
 */
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int nIndex = 0;
		for (int i = m; i < m + n; i++) {
			nums1[i] = nums2[nIndex];
			nIndex++;
		}
		Arrays.sort(nums1);
	}

	public static void main(String[] args) {
		int[] m = {0};
		int[] n = {1};
		new MergeSortedArray().merge(m, 0, n, 1);
		System.out.println(Arrays.toString(m));
	}
}
