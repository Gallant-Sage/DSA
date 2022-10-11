// https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/

public class SimilarEnds {
	static int minimumLength(String s) {
        int i=0, j=s.length()-1;
        while (i<j) {
            char first = s.charAt(i);
            char last = s.charAt(j);
            if (first==last) {
                while (i < s.length() && s.charAt(i)==first) {
                    i++;
                }
                while (j >= 0 && s.charAt(j)==first) {
                    j--;   
                }
            }else{
                return j-i+1;
            }
        }
        return i == j ? 1 : 0;
    }
	

	public static void main(String[] args){
		System.out.println(minimumLength("aabccabba"));
	}	
}