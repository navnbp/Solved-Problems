package Array;
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		if (matrix.length == 0)
			return list;

		int rowBegin = 0;
		int rowEnd = matrix.length - 1;
		int colBegin = 0;
		int colEnd = matrix[0].length - 1;

		while (rowBegin <= rowEnd && colBegin <= colEnd) {

			for (int j = colBegin; j <= colEnd; j++) {
				list.add(matrix[rowBegin][j]);
			}
			rowBegin++;

			for (int j = rowBegin; j <= rowEnd; j++) {
				list.add(matrix[j][colEnd]);
			}
			colEnd--;
			if (rowBegin <= rowEnd) {
				for (int j = colEnd; j >= colBegin; j--) {
					list.add(matrix[rowEnd][j]);
				}
			}
			rowEnd--;
			if (colBegin <= colEnd) {
				for (int j = rowEnd; j >= rowBegin; j--) {
					list.add(matrix[j][colBegin]);
				}
			}
			colBegin++;
		}

		return list;

	}

	// 1 2 3
	// 4 5 6
	// 7 8 9
	// 101112
	// 1,2,3, 6,9,12, 11,10,,7,4,,5,8
	public static void main(String[] args) {
		SpiralMatrix obj = new SpiralMatrix();
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 },
				{ 10, 11, 12 } };
		System.out.println(obj.spiralOrder(matrix));

	}

}