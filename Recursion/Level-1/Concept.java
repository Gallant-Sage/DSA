public class Concept {
	public static void main(String[] args) {
		fun(5);
	}

	static void fun(int n) {
		System.out.println(n);
		// passes --> fun(5) and after printing 5, again gets 5 & passes it.
		fun(n--); // stack overflow.
        
        // passes --> fun(4) to the function.
        fun(--n);  
	}
}

// n-- vs --n :
// n-- : first passes n then decrements it.
// --n : first decrements n then passes it.