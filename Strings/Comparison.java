public class Comparison {
	public static void main(String[] args) {
		// way - 1:
		String a = "Sourabh";
		String b = "Sourabh";

		// System.out.println(a == b);

		// way - 2:
		String c = new String("Bisht");
		String d = new String("Bisht ");

		// System.out.println(c == d);
		System.out.println(c.equals(d));
	}
}

// In way - 1, a & b both are pointing to the same objects, so (a == b) gives true.
// But, in way - 2 a & b both are pointing to different objects(due to new keyword),
// so (c == d) is false.As == operator checks if ref var's are pointing to same object
// or not.

// To check only values use .equals() function.It only checks the value of ref var's.

// 							*~ Important ~*
// new keyword explicitly creates new objects outside of String Pool but inside heap. 
// whitespace is also a String. e,g --> "Name" != "Name ", because of whitespace.