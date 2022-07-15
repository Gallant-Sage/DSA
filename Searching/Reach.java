public class Reach {
	public static void main(String[] args) {
		int target = 2;
		System.out.println(reachNumber(target));
	}

	static int reachNumber(int target) {
		
		int currrentPosition = 0;

		for (int i = 1; i <= target + 1 ; i++) {
			
			currrentPosition = target - i;

			if (currrentPosition == target) {
				return currrentPosition;
			} else if (currrentPosition < i) {
				currrentPosition += i;
			} else {
				currrentPosition -= i;
			}
		}

		return 0;
	}
}	
