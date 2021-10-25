import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Problem 451.
 */
public class SortCharactersByFrequency {
	public String frequencySort(String s) {
		Map<Character, Integer> initialFrequency = new HashMap<>();
		for (char c : s.toCharArray()) {
			initialFrequency.merge(c, 1, Integer::sum);
		}

		LinkedHashMap<Character, Integer> sortedFrequency = initialFrequency.entrySet().stream()
			.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			.collect(Collectors.toMap(Map.Entry::getKey,
				Map.Entry::getValue,
				(e1, e2) -> e1, LinkedHashMap::new));

		StringBuilder sb = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : sortedFrequency.entrySet()) {
			sb.append(String.valueOf(entry.getKey()).repeat(Math.max(0, entry.getValue())));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(new SortCharactersByFrequency().frequencySort("tree"));
	}
}
