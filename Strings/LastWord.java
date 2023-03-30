// https://leetcode.com/problems/length-of-last-word/

public class LastWord {
	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		

		System.out.println(lengthOfLastWord(s));
	}

	static int lengthOfLastWord(String s) {
        String[] newStr = s.trim().split(" ");

        return newStr[newStr.length - 1].length();
    }
}