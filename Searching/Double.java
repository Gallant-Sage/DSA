// https://leetcode.com/problems/check-if-n-and-its-double-exist/

import java.util.Arrays;
public class Double {
	public static void main(String[] args) {
		int[] arr = { 10, 2, 5, 3 };
		System.out.println(checkIfExist(arr));
	}

	static boolean checkIfExist(int[] arr) {
        
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            
            int start = 0;
            int end = arr.length - 1;
        	while (start <= end) {
        		int mid = start + (end - start) / 2;
        	
        	    if (arr[mid] == 2 * arr[i] && mid != i) {
        	    	return true;
        	    }

        	    else if (arr[mid] < 2 * arr[i]) {
        	    	start = mid + 1;
        	    }

        	    else {
        	    	end = mid - 1;
        	    }
        	}
        }
        
        return false;
    }
}