public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7, 12, 14, 17 };
		System.out.println(testing(arr));
	}

	static int testing(int[] arr) {
        int start = 0;
        int end = 0;
		for (int i=0; i<2; i++) {
			start = arr[0];
			end = arr[1];
		}
        System.out.println("start + 1:" + start + 1 + " end + 1:" + end + 1);
		return (start + 1 & end + 1);
	}
}