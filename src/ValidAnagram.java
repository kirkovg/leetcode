import java.util.Arrays;

/**
 * Problem 242.
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] first = s.toCharArray();
		Arrays.sort(first);
		char[] second = t.toCharArray();
		Arrays.sort(second);
		for (int i = 0; i < first.length; i++) {
			if (first[i] != second[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
		System.out.println(new ValidAnagram().isAnagram("rat", "car"));
	}
}
