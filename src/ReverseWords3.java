/**
 * Problem 557.
 */
public class ReverseWords3 {
	public String reverseWords(String s) {
		String trimmed = s.trim();
		String[] parts = trimmed.split("\\s+");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < parts.length; i++) {
			if (i == parts.length - 1) {
				stringBuilder.append(reverseString(parts[i].toCharArray()));
			} else {
				stringBuilder.append(reverseString(parts[i].toCharArray())).append(" ");
			}
		}
		return stringBuilder.toString();
	}

	private String reverseString(char[] s) {
		int start = 0;
		int end = s.length - 1;

		while (start <= end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
		return String.valueOf(s);
	}
}
