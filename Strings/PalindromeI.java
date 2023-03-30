public class PalindromeI {
	public static void main(String[] args) {
		String s = "race a car";
		

		System.out.println(isPalindrome(s));
	}

	static boolean isPalindrome(String s) {
        
		// replace the given string
        // with empty string
        // except the pattern "[^a-zA-Z0-9]

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String ans = "";

		for(int i = s.length() - 1; i >= 0; i--) {
			ans += s.charAt(i);
		}



		if(s.equals(ans)) {
			return true;
		}

		return false;
    }
}