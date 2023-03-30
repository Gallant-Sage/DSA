import java.util.Arrays;

public class Shuffle {
	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = { 4,5,6,7,0,2,1,3 };

		System.out.println(restoreString(s, indices));
	}

	static String restoreString(String s, int[] indices) {
        char[] newArr = new char[indices.length];
		int index = 0;

		for(int i : indices) {
			newArr[i] = s.charAt(index++);
		}

		// To convert char[] array to String.
		return new String(newArr);
    }
}
