// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Q3

// Ans --> 'c'
public class SmallestLetter {
	public static void main(String[] args) {
		
		char[] letters = { 'c', 'f', 'j' };
		char target = 'a';
		System.out.println(nextGreatestLetter(letters, target));
	}

	public static char nextGreatestLetter(char[] letters, char target) {

		int start = 0;
		int end = letters.length - 1;

		while(start <= end) {

  		  int mid = start + (end - start) / 2;
          
          if(target < letters[mid]) {
          	  end = mid - 1;
            }
          else {
          	  start = mid + 1;
            }
		}
	
	// If there is no letter greater than target then 'start' wil reach last index & below statement 
	// will return the first element. Otherwise whereever the 'start' is will be the answer. 
	// => 0 % 8 = 0, 'c' will be returned. 
	
	return letters[start % letters.length];
	}
 
}


// 4 Nov 2022.