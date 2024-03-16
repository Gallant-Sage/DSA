public class Pretty {
	public static void main(String[] args) {
		float a = 453.1274f;
		System.out.printf("The formatted output is %.2f", a);
		System.out.println();

		System.out.println(Math.PI);

		System.out.printf("Pie %.3f" , Math.PI);
		System.out.println();

		System.out.printf("Hi I am %s and i am %s", "Sourabh", "fucking dope");
	}
}

// Syntax: <placeholder> <precision> <datatype>
// <precision> --> till how many digits you wanna print after a "."
// <datatype> --> "%f" --> float 
// 				  "%d" --> double
// 				  "%c" --> character
// 				  "%t" --> date & time
// 				  "%x" --> hexadecimal values
// 				  "%oc" --> octal
// 				  "%u" --> unsigned decimal no.
// 				  "%i" --> Integer
// printf() also rounds-off.