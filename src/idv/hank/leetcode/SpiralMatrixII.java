package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/spiral-matrix-ii/
 *
 */
public class SpiralMatrixII {

	public int[][] generateMatrix(int n) {
		int value = 1;
		int[][] matrix = new int[n][n];

		final int median = matrix.length / 2;
		for (int i = 0; i < median; i++) {
			value = printBorderValue(matrix, value, i);
		}
		printCoreMatrix(matrix, value, median);
		return matrix;
	}

	private int printBorderValue(int[][] matrix, int value, int start) {
		int length = matrix.length;
		int lastIndex = length - 1;
		int duplateIndex = 1;

		for (int i = start; i < length - start; i++) {
			matrix[start][i] = value++;
		}
		for (int i = duplateIndex + start; i < length - start; i++) {
			matrix[i][lastIndex - start] = value++;
		}
		for (int i = duplateIndex + start; i < length - start; i++) {
			matrix[lastIndex - start][lastIndex - i] = value++;
		}
		for (int i = duplateIndex + start; i < length - start - 1; i++) {
			matrix[lastIndex - i][start] = value++;
		}
		return value;
	}

	private void printCoreMatrix(int[][] matrix, int value, int median) {
		int lenght = matrix.length;
		if (lenght % 2 != 0) {
			matrix[median][median] = value++;
		}
	}

}
