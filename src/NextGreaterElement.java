import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer, Integer> nums2Map = new HashMap<>();
		for (int i = 0; i < nums2.length; i++) {
			try {
				nums2Map.put(nums2[i], nums2[i + 1]);
			} catch (Exception e) {
				nums2Map.put(nums2[i], null);
			}
		}

		int[] result = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {
			int num = nums1[i];
			Integer greater = nums2Map.get(num);
			if (greater != null && greater > num) {
				result[i] = greater;
			} else {
				result[i] = -1;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Arrays.stream(new NextGreaterElement()
				.nextGreaterElement(new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7}))
			.forEach(System.out::println); // all 7s
	}
}
