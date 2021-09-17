import java.util.HashMap;
import java.util.Map;

/**
 * Problem 217.
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Map<Integer, Integer> numsFrequency = new HashMap<>();
		for (int num : nums) {
			if (numsFrequency.containsKey(num)) {
				return true;
			}
			numsFrequency.put(num, numsFrequency.getOrDefault(num, 0));
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,4}));
	}
}
