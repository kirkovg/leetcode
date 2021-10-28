import java.util.Arrays;

/**
 * Problem 566.
 */
public class ReshapeTheMatrix {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int rowSize = mat[0].length;
		int colSize = mat.length;
		if (rowSize * colSize != r * c) {
			return mat;
		}
		int[][] result = new int[r][c];

		int n = 0;
		int m = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				result[i][j] = mat[m][n];
				n++;
				if (n == rowSize) {
					m++;
					n = 0;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] row1 = new int[]{1, 2};
		int[] row2 = new int[]{3, 4};
		int[][] matrix = new int[][] {row1, row2};
		int[][] result = new ReshapeTheMatrix().matrixReshape(matrix, 1, 4);
		for (int[] ints : result) {
			System.out.println(Arrays.toString(ints));
		}
	}
}
