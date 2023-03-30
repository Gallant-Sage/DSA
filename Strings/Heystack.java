public class Heystack {
	public static void main(String[] args) {
		String haystack = "aaaa"; 
		String needle = "";
		System.out.println(strStr(haystack, needle));

	}

	static int strStr(String haystack, String needle) {
        if(needle.equals("") || needle.equals(" ")) {
        	return 0;
        } 

        return haystack.indexOf(needle);
    }
}