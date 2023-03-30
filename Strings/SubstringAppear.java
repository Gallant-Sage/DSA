public class SubstringAppear {
	public static void main(String[] args) {
		String[] patterns = { "a", "b", "c" };
		String word = "aaaaabbbbb";

		System.out.println(numOfStrings(patterns, word));
	}

	static int numOfStrings(String[] patterns, String word) {
        
        int count = 0;

		for(String s : patterns) {
			if(word.contains(s)) {
				count++;
			}
		}

		return count;
    }
}