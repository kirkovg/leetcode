import java.util.HashMap;
import java.util.Map;

/**
 * Problem 383.
 */
public class RansomNote {

	public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) {
			return false;
		}
		Map<Character, Integer> ransomNoteCharFrequency = new HashMap<>();
		ransomNote.chars().mapToObj(i -> (char) i)
			.forEach(c -> ransomNoteCharFrequency.merge(c, 1, Integer::sum));

		Map<Character, Integer> magazineCharFrequency = new HashMap<>();
		magazine.chars().mapToObj(i -> (char) i)
			.forEach(c -> magazineCharFrequency.merge(c, 1, Integer::sum));

		int missingCount = 0;

		for (Map.Entry<Character, Integer> entry : ransomNoteCharFrequency.entrySet()) {
			if (magazineCharFrequency.containsKey(entry.getKey())) {
				if (magazineCharFrequency.get(entry.getKey()) < ransomNoteCharFrequency.get(entry.getKey())) {
					return false;
				}
			} else {
				missingCount++;
			}
		}

		return missingCount <= 0;
	}

	public static void main(String[] args) {
		System.out.println(new RansomNote().canConstruct("aa", "ab"));
		System.out.println(new RansomNote().canConstruct("aa", "aab"));
		System.out.println(new RansomNote().canConstruct("a", "b"));
		System.out.println(new RansomNote().canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
	}
}
