public class SortedMatrix {
	public static void main(String[] args) {
		int[][] matrix = { 
			{4,3,2,-1},
		    {3,2,1,-1},
		    {1,1,-1,-2},
		    {-1,-1,-2,-3}
		};
	}

	static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
		while (cStart <= cEnd) {
			int mid = cStart + (cEnd - cStart) / 2;
			if (matrix[row][mid] == target) {
				return new int[]{ row, mid };
			}
			if (matrix[row][mid] < target) {
				cStart = mid + 1;
			} else {
				cEnd = mid - 1;
			}
		}

		return new int[]{ -1, -1 };
	}

	static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

		while () {
			if (rows == 1) {
				return binarySearch(matrix, 0, 0, cols - 1, target);
			}
		}
	}
}