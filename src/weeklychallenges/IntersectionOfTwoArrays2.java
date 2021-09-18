package weeklychallenges;

import java.util.*;

/**
 * Problem 350.
 */
public class IntersectionOfTwoArrays2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map1 = new HashMap<>();
		for (int x : nums1) {
			map1.merge(x, 1, Integer::sum);
		}
		Map<Integer, Integer> map2 = new HashMap<>();
		for (int x : nums2) {
			map2.merge(x, 1, Integer::sum);
		}
		List<Integer> result = new ArrayList<>();
		for (Integer value : map1.keySet()) {
			if (map2.containsKey(value)) {
				int frequency = Math.min(map1.get(value), map2.get(value));
				result.addAll(Collections.nCopies(frequency, value));
			}
		}
		return result.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new IntersectionOfTwoArrays2()
			.intersect(new int[]{1,2,2,1}, new int[]{2,2})));
	}
}
