public class Coins {
	public static void main(String[] args) {
		System.out.println(arrangeCoins(5));
	}

	static int arrangeCoins(int n) {
		int start = 1;
		int end = n;
		while(start < end) {
			int mid = start + (end - start) / 2;
			if(mid > mid - 1) {
				start = mid + 1;
			} else {
				return mid - 1;
			}
		}

		return -1;
	}
}
