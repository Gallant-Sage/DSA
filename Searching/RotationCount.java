// 
public class RotationCount {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(countRotations(arr));
	}

	static int countRotations(int[] arr) {
		int pivot = findPivot(arr);
		return pivot + 1;
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

    // For duplicate values.
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
    			// NOTE: what if these elements st start & end were pivots??
    			// check if start is pivot
    			if (arr[start] > arr[start + 1]) {
    				return start;
    			}

    			start++;

    			// Check if end is pivot.
    			if (arr[end] < arr[end - 1]) {
    				return end - 1;
    			}

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

// 20 MAY 2022
// 30 Oct 2022