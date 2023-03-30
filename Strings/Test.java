import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		String s1 = " Sourabh ";
		String s2 = " Bisht ";

		char ch = s1.charAt(0);
		System.out.println("This is :" + s1.substring(0, 2) + ch);

		// charAt(i)
		// for(int i = 0; i < s1.length(); i++) {
			
		// 	System.out.println(s1.charAt(i));
		// }
		
		// The substring begins with the character at the specified index and extends
		// to the end of this string. And index of substring starts from 1 and not from 0.
		
		// substring(int i, int j) --> Returns the substring from i to j-1 index.
		// substring(int i) --> Returns substring from i to (index - 1).
		System.out.println("here: " + s1.substring(4));
		System.out.println(s1.substring(0, 0));

		// concat(String s)
		System.out.println(s1.concat(" " + s2));

		// indexOf(String s, int i), indexOf(String s)
		System.out.println(s1.indexOf("ra", 2));

		// lastIndexOf(String s)
		System.out.println(s1.concat(" " + s2).lastIndexOf("h"));

		// equals(Object obj), equalsIgnoreCase(String s)
		System.out.println(s1.equals(" Sourabh "));

		System.out.println(s1.equalsIgnoreCase("sourabh"));

		// compareTo(String s) --> compares two strings lexiographically.
		// This returns difference s1-s2. If :
	 	// 	s1 < 0  // s1 comes before s2
 		// 	s1 = 0   // s1 and s2 are equal.
 		// 	s1 > 0   // s1 comes after s2.
		 	
		 	System.out.println(s1.compareTo(s2));

		// compareToIgnoreCase(String s)
		System.out.println(s1.compareToIgnoreCase(" sourabh "));

		// trim() -->  Returns the copy of the String, by removing whitespaces at both ends.
		// It does not affect whitespaces in the middle.
		System.out.println(s1.trim());

		// replace(char oldChar, char newChar) --> Returns new string by replacing all occurrences
		// of oldChar with newChar.
		System.out.println(s1.replace('o', 'a'));

		// split().
		System.out.println(Arrays.toString("This is a text".split(" ")));
		
		String s = "HOW ARE YOU";

		System.out.println(Arrays.toString(s.split(" ")));

		// startsWith()
		// startsWith(String prefix, int strt_pos)
	}
}