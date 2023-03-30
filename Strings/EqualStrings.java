import java.util.*;

public class EqualStrings {
	public static void main(String[] args) {
		String[] word1 = { "a", "cb" };
		String[] word2 = { "ab", "c" };
		boolean ans = arrayStringsAreEqual(word1, word2);
		System.out.println(ans);

        
	}

	static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String one = "";
        String two = "";

        for(int i = 0; i < word1.length; i++) {
            one += word1[i];
        }

        for(int i = 0; i < word2.length; i++) {
            two += word2[i];
        }

        return one.equals(two);
    }
}