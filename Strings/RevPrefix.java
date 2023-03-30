public class RevPrefix {
	public static void main(String[] args) {
		String word = "abcd";
		char ch = 'z';

		System.out.println(reversePrefix(word, ch));
	}

	static String reversePrefix(String word, char ch) {
      
        int index = word.indexOf(ch);
        String ans1 = "";

        for (int i = index; i >= 0; i--) {
        	ans1 += word.charAt(i);
        }

        String ans = ans1 + word.substring(index + 1, word.length());;

        return ans;
    }
}

// begIndex should be less than endIndex.