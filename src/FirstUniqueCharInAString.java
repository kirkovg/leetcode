import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Problem 387.
 */
public class FirstUniqueCharInAString {
	static final class StringInfo {
		int count;
		int index;

		StringInfo(int count, int index) {
			this.count = count;
			this.index = index;
		}
	}

	public int firstUniqChar(String s) {
		Map<Character, StringInfo> charFrequency = new LinkedHashMap<>();
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (charFrequency.containsKey(chars[i])) {
				charFrequency.get(chars[i]).count++;
			} else {
				charFrequency.put(chars[i], new StringInfo(1, i));
			}
		}


		for (Map.Entry<Character, StringInfo> entry : charFrequency.entrySet()) {
			StringInfo value = entry.getValue();
			if (value.count == 1) {
				return value.index;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(new FirstUniqueCharInAString().firstUniqChar("leetcode"));
		System.out.println(new FirstUniqueCharInAString().firstUniqChar("loveleetcode"));
		System.out.println(new FirstUniqueCharInAString().firstUniqChar("aabb"));
		System.out.println(new FirstUniqueCharInAString().firstUniqChar("dddccdbba"));
	}
}
