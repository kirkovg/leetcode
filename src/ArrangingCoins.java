/**
 * Problem 441.
 */
public class ArrangingCoins {
	public int arrangeCoins(int n) {
		int completeRows = 0;
		for (int i = 1; i <= n; i++) {
			completeRows++;
			n -= i;
		}
		return completeRows;
	}

	public static void main(String[] args) {
		System.out.println(new ArrangingCoins().arrangeCoins(8));
	}
}