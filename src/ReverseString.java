/**
 * Problem 344.
 */
public class ReverseString {
	public void reverseString(char[] s) {
		int start = 0;
		int end = s.length - 1;

		while (start <= end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		char[] s = new char[] {'H', 'e', 'l', 'l', 'o'};
		new ReverseString().reverseString(s);
		System.out.println(s);
	}
}
