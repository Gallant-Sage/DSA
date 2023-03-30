
public class Shifting {
	public static void main(String[] args){
		int[] arr = {3, 5, 9};
		// System.out.println(shiftingLetters("abc", arr));

		System.out.println(shifting("abc", arr));
	}

	static String shiftingLetters(String s, int[] shifts) {
        shifts[shifts.length - 1] = shifts[shifts.length - 1] % 26;

        for (int i = shifts.length - 2; i >= 0; i--) {
        	
        	shifts[i] = shifts[i+1] + shifts[i] % 26;
        }

        char ch[] = s.toCharArray();

        for (int j = 0; j < ch.length; j++) {
        	ch[j] = (char)((ch[j] - 'a' + shifts[j]) % 26 + 'a');
        }

        return new String(ch);
    }	
}
	
	
