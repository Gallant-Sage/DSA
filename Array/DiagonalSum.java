public class DiagonalSum {
	public static void main(String[] args) {
		int[][] mat = {
			{1,2,3},
            {4,5,6},
            {7,8,9}
		};

		System.out.println(diagonalSum(mat));
	}

	public static int diagonalSum(int[][] mat) {
		int ans = 0;

        for(int i=0; i<mat.length; i++) {
            ans += mat[i][i];
            ans += mat[mat.length-1-i][i];
        }

        if(mat.length % 2 == 1) {
            ans -= mat[mat.length/2][mat.length/2];
        }

        return ans;
	}
}