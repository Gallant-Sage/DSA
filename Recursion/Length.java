// https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/

public class Length {
	public static void main(String[] args){
		// System.out.println(lengthOfString("GEEKSFORGEEKS", 0));
		System.out.println(len("aabd"));
	}	
	
	static int lengthOfString(String str, int len) {
		if (str.length() == 0) {
			return len;
		}

		return lengthOfString(str.substring(1), len + 1);

	}

    static int len(String str) {
 
        if (str.equals("")) {
            return 0;
        }

        else
            return len(str.substring(1)) + 1;
    }

}