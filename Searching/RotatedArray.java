public class RotatedArray {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
		int target = 0;
		System.out.println(search(nums, target));
	}

	static boolean search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        
        if(pivot == target) {
            return true;
        }
        
        if(target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } 
        
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static boolean binarySearch(int[] arr, int target, int start, int end) {
        
        while(start <= end) {
        		int mid = start + (end - start) / 2;

        		if (target < arr[mid]) {
        			end = mid - 1;
        		}
        		
        		else if (target > arr[mid]) {
        		 	start = mid + 1;
        		}

        		else {
        			return true;
        	}
        }

        return false;
    }
    
    
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

    		if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
    			
                if (arr[start] > arr[start + 1]) {
    				return start;
    			}

                start++;

    			if (arr[end] < arr[end - 1]) {
    				return end - 1;
    			}

                end--;
    		}


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