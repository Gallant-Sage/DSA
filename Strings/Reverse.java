public class Reverse {
	public static void main(String[] args) {
		String s = "God Ding";
		System.out.println(reverseWords(s));

	}

	static String reverseWords(String s) {
        String[] str = s.split(" ");
        String ans = "";

        for(int i = 0; i < str.length; i++) {

        	if(str[i] != " ") {
        		String rev = "";

        		for(int j = str[i].length() - 1; j >= 0; j--) {
        			ans += String.valueOf(str[i].charAt(j));
        		}	
        	
        		ans += rev + " ";

        	}

        }

        return ans.trim();
    }
}

// 

//         			

