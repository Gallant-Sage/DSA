public class Performance {
	public static void main(String[] args) {
		String series = "";

		for(int  i = 0; i < 26; i++) {
			char ch = (char)('a' + i);
			series += ch;
		}

		System.out.println(series);
	}
}

// series = ""
// series = "" + 'a' = "a"
// series = "a" + 'b' = "ab"
// series = "ab" + 'c' = "abc"
// series = "abc" + 'd' = "abcd"
// series = "abcd" + 'e' = "abcde"

// This is not an optimized sol., as after every iteration series is pointing
// to a different object. At the end there will be { a. ab, abc, abcd ....abcd...y }
// no. of elements unused left in the memory, time complexity will be O(n^2) which
// is not good.

// We can solve this problem by using StringBuilder class, which is mutable.
// It let's us modify the ref variable(does not create new objects). 