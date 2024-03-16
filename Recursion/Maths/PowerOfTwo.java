// Power of two.

public class PowerOfTwo {
	public static void main(String[] args) {
		int n = 16; // need a check for 0.
		boolean ans = (n & (n - 1)) == 0;

		System.out.println(ans);
	}
} 	
