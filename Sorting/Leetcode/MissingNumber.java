// https://leetcode.com/problems/missing-number/
// Amazon Question

import java.util.Arrays;
public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 0, 2, 1 };
		missingNumber(arr);
		System.out.println(missingNumber(arr));
	}

	static int missingNumber(int[] arr) {
		int i = 0;
        while(i < arr.length) {
           
            // In this case , correct = arr[i].
        	
            int correct = arr[i];
        	if(arr[i] < arr.length && arr[i] != arr[correct]) {
        		swap(arr, i, correct);
        	}
        	else {
        		i++;
        	}
        }

        // Search for missing no.
        for(int index = 0; index < arr.length; index++) {
        	if(arr[index] != index) {
        		return index;
        	}
        }

        // Case 2 :
        return arr.length;
	}
	static void swap(int[] arr, int first, int second) {
    	int temp = arr[first];
    	arr[first] = arr[second];
    	arr[second] = temp;
    }
}
        

 
