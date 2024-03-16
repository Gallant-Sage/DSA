public class Sorted {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 8, 9, 12 };
		System.out.println(sorted(arr, 0));
	}

	static boolean sorted(int[] arr, int ind) {
		// base condition
		if(ind == arr.length - 1) {
			return true;
		}

		return arr[ind] < arr[ind + 1] && sorted(arr, ind + 1);
	}
}