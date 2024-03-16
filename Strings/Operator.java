import java.util.*;

public class Operator {
	public static void main(String[] args) {
		
		System.out.println('a' + 'b');
		// 1 will be converted to Integer which will call toString().
		// This is similar to "a" + "1"
		System.out.println("a" + 1);
		System.out.println("a" + new ArrayList<>());
		
		System.out.println(new int[20] + "" + new ArrayList<>());
		
		// System.out.println(new Integer(56) + "" + new ArrayList<>());
		// new Integer(56) --> it is deprecated
	}
}

// In java Operator overloading is not supported.
// If we wanna concatenate using '+' operator atleast one of the arguments
// in the println() must be a String.