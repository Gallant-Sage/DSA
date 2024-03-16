public class SetBits {
	public static void main(String[] args) {
		int n = 0;
		
		System.out.println(Integer.toBinaryString(n));

		System.out.println(countTotalBits(n));
	}

	private static int countTotalBits(int n) {
		int count = 0;

		// Method - 1:

		// while (n > 0) {
		// 	count++;
		// 	n -= (n & -n);
		// }
        

        // Method - 2:

        while (n > 0) {
        	count++;
        	n = n & (n - 1);
        }
		
		return count;
	}
}