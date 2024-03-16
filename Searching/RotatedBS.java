// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class RotatedBS {
	public static void main(String[] args) {
		
		int[] arr = { 2, 5, 6, 0, 0, 1, 2 };
		int target = 0;
		System.out.println(search(arr, target));

	}

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        
        // If did not find pivot , the array is not rotated.
        if (pivot == -1) {
        // then just do normal binary search.
       	return binarySearch(nums, target, 0, nums.length - 1);
        }   
         
        // if pivot is found, we have 2 sorted asc arrays.         
        if (nums[pivot] == target) {
        	return pivot;
        }

        if (target >= nums[0]) {
        	return binarySearch(nums, target, 0, pivot - 1);
        }
        	
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
        
    }

    // Normal binary search
    static int binarySearch(int[] arr, int target, int start, int end) {
        
        while(start <= end) {
        		int mid = start + (end - start) / 2;

        		if (target < arr[mid]) {
        			end = mid - 1;
        		}
        		
        		else if (target > arr[mid]) {
        		 	start = mid + 1;
        		}

        		else {
        			return mid;
        	}
        }

        return -1;
    }
       
    // This program will not work for duplicate values.
    static int findPivot(int[] arr) {

    	int start = 0;
    	int end = arr.length - 1;

    	while(start <= end) {
    		int mid = start + (end - start) / 2;

    		// 4 Cases :
    		// mid < end to avoid index out of bound. 
    		if(mid < end && arr[mid] > arr[mid + 1]) {
    			return mid;
    		}
            
            // mid > start for arr[0] < arr[0 - 1].
    		if(mid > start && arr[mid] < arr[mid - 1]) {
    			// * here error occured due to mid + 1 *
    			return mid - 1;
    		}

    		if(arr[mid] <= arr[start]) {
    			end = mid - 1;
    		}

    		else {
    			start = mid + 1;
    		}
    	}
 
    	return -1;

    }

    // This will work for duplicates.
    static int findPivotWithDuplicates(int[] arr) {
    	int start = 0;
    	int end = arr.length - 1;
    	while(start <= end) {
    		int mid = start + (end - start) / 2;
 
    		if(mid < end && arr[mid] > arr[mid + 1]) {
    			return mid;
    		}

    		if(mid > start && arr[mid] < arr[mid - 1]) {
    			return mid - 1;
    		}

    		// if elements at start, end & mid are same then just skip the duplicates.
    		if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
    			// skip the duplicates
    			// NOTE: what if these elements at start & end were pivots??
    			// check if start is pivot
    			// E.g --> [2,1,2,2,2,2]

                if (arr[start] > arr[start + 1]) {
    				return start;
    			}

    			// To ignore duplicates.
                start++;

    			// Check if end is pivot.
                // E.g --> [2,2,2,2,3,2]
    			if (arr[end] < arr[end - 1]) {
    				return end - 1;
    			}

    			// To ignore duplicates.
                end--;
    		}


    	    // left side is sorted, so pivot should be in right.
    	    else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[start])) {
    	    	start = mid + 1;
    	    }
    	     
    	    else {
    	    	end = mid - 1;
    	    }

        }
    		
    	return -1;
    }
}


        
// 19 May 2022
