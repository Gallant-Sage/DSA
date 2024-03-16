// https://leetcode.com/problems/flipping-an-image

import java.util.Arrays;

public class Flip {
	public static void main(String[] args) {
		int[][] image = {
			{1,1,0},
			{1,0,1},
			{0,0,0}
		};
		
		flipAndInvertImage(image);
	}

	public static int[][] flipAndInvertImage(int[][] image) {
		if (image == null || image.length == 0 || image[0].length == 0) {
            return image;
        }

		for (int[] row : image) {
			// System.out.println(Arrays.toString(row));
			int start = 0;
			int end = row.length - 1;

			while (start <= end) {
				if (row[start] == row[end]) {
					row[start] ^= 1;
					row[end] = row[start];
				}
				
				start++;
				end--;
			}
		}

		return image;
	}

	public static int[][] flipAndInvertImage2(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] result = new int[row][col];
        
		// Step 1 : revert
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                result[i][j] = A[i][col-j-1];
            }
        }
        // Step 2: invert
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                result[i][j] = result[i][j] == 1 ? 0 : 1;
            }
        }
        return result;
    }

}