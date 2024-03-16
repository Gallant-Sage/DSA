public class ReverseNo {
	
	// Way - 1:
	static int sum = 0;
	static void reverse(int n) {
		if(n == 0) {
			return;
		}

		sum = sum * 10 + (n % 10);
        reverse(n / 10);
	}

	// Way - 2:
	static int rev2(int n) {
		int digits = (int)(Math.log10(n)) + 1; // to count no. of digits in n.
		return helper(n, digits);
	}

	// helper function for rev2.
	private static int helper(int n, int digits) {
		if (n % 10 == 0) {
			return n;
		}

		int rem = n % 10;
		return rem * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
	}


    // To find palindrome.
	static boolean palindrome(int n) {
		return n == rev2(n);
	}

	

	// main method.
	public static void main(String[] args) {

		System.out.println(palindrome(1234432));
	}
}
	