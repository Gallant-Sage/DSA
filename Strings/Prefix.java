// https://leetcode.com/problems/longest-common-prefix/

public class Prefix {
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		int j = 1;
		int k = 2;

		System.out.println(strs[0].substring(0, 2));

		for(int i = 0; i < strs.length; i++) {
			if(j < strs.length && strs[i].startsWith(String.valueOf(strs[j].charAt(i)))) {
				System.out.println(strs[i].substring(0, i + 1));
				j++;
			} else {
				j++;
			}

		}
	}

	// static String longestCommonPrefix(String[] strs) {
        
 //    }
}