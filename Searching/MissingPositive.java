// https://leetcode.com/problems/kth-missing-positive-number/

import java.util.Arrays;
public class MissingPositive {
	public static void main(String[] args) {
		int[] ahttps://leetcode.com/problems/kth-missing-positive-number/rr = { 2, 3, 4, 7, 11 };
		int k = 5;
		System.out.println(findKthPositive(arr, k));
	}

	static int findKthPositive(int[] arr, int k) {
        
        System.out.println(Arrays.toString(storeMissing(arr)));
        return arr[k - 1];
	}


	static int[] storeMissing(int[] arr) {
        int[] missing = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] != i + 1) {
        		for (int j = 0; j < missing.length; j++) {
        			missing[j] = i + 1;
        		}
        	}
        }
        
        return missing;
    }

    static int check(int[] arr, int index) {
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == index) {
    		 	return;
    		 }  
    		 
    	}
    }
}