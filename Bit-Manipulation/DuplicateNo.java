// https://leetcode.com/problems/add-binary/

public class DuplicateNo {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 3, 4, 2, 6, 4, };
		System.out.println(ans2(arr));
	}
	public static int ans(int[] arr) {
		int unique = 0;

		for(int n : arr) {
			unique ^= n;
		}

		return unique;
	}

	public static int ans2(int[] arr) {
		int unique = 0;

		for(int i = 0; i < arr.length; i++) {
			unique = unique ^ arr[i];
		}

		return unique;
	}
}

// Explanation --> 2^3^4^1^2^1^3^6^4
//             --> 2^2^3^3^4^4^1^1^6
//             --> 0^6 = 6 ANS