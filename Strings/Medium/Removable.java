// https://leetcode.com/problems/maximum-number-of-removable-characters/

public class Removable {
	static int maximumRemovals(String s, String p, int[] removable) {
        int count = 0;

        for (int i = 0; i < removable.length; i++) {
        	StringBuilder ans = new StringBuilder();
        	ans.append(s);

        	ans.append(ans.substring(0, removable[i]));
        	ans.append(ans.substring(removable[i], ans.length()));

        	if (ans.toString().contains(p)) {
        		count++;
        	} else {
        		return count;
        	}
        }

        return 0;
    }
	

	public static void main(String[] args){
		String s = "abcbddddd";
		String p = "abcd";
		int[] removable = {3,2,1,4,5,6};

		System.out.println(maximumRemovals(s, p, removable));
	}	
}
