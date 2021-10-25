/**
 * Problem 151.
 */
public class ReverseWords {
	public String reverseWords(String s) {
		String trimmed = s.trim();
		String[] parts = trimmed.split("\\s+");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = parts.length - 1; i >= 0; i--) {
			if (i == 0) {
				stringBuilder.append(parts[i]);
			} else {
				stringBuilder.append(parts[i]).append(" ");
			}
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println(new ReverseWords().reverseWords("   hello world   "));
	}
}
