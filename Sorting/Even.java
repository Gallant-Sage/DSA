public class Even {
	
	public static int findNumbers(int[] nums) {
        
       int count = 0;
       for(int num : nums) {
       	  if(even(num)) {
       		  count++;
       	  }
       }
       
       return count; 
    
    }
// To check if the digit is even or odd.
    static boolean even(int num) {
    	
    	int numberofdigits = digits(num);
    	return numberofdigits % 2 == 0;

    }

// Count no. of digits in a no.
    static int digits(int num) {
    	
    	int count = 0;

    	while(num > 0) {
    		count++;
    		num /= num;
    	}

    	return count;

    }

	public static void main(String[] args) {
		
		int[] nums = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
	
	}
}