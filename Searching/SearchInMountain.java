// 

public class SearchInMountain {
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
		int target = 7;
		System.out.println(search(arr, target));
	}
    
    static int search(int[] arr, int target) {
    	
    	int peak = peakIndexInMountainArray(arr);
		int firstTry = OAbinarySearch(arr, target, 0, peak);

		if (firstTry != -1) {
			
			return firstTry;
		
		}
		
		// try to search in 2nd half.
		return OAbinarySearch(arr, target, peak + 1, arr.length - 1);

    }

	public static int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {

        	int mid = start + (end - start) / 2;

        	if(arr[mid] > arr[mid + 1]) {
        		// we are in the des. part of array.
        		// this might be the answer but check whether element at 
        		// left is not greater than arr[mid]. i.e., [ 1,2,3,5,6,4,3,2 ]
                // that's why end != (mid - 1)
        		
        		end = mid;
        	}
        	else {
        		// we are in asc. part of array.
        		// we will ignore arr[mid] bcoz arr[mid + 1] is greater.
        		start = mid + 1;
        	}
        }
        // In the end , start == end and pointing to
        // largest no. bcoz of two checks above.
        return end; // we can return start as well as they're pointing to same elements.
    }

    static int OAbinarySearch(int[] arr, int target, int start, int end) {
        
        // To check whether array is ascending or descending.
		boolean isAsc = arr[start] < arr[end];

		while(start <= end) {
			
			// Better way to find mid. 
			int mid = start + (end - start) / 2;

			if(arr[mid] == target) {
				return mid;
			}

			if(isAsc) {
				
				  if(target < arr[mid]) {
				      end = mid - 1;
			        }
			      else {
				      start = mid + 1;
			        }
		    }
		    else {
		    	if(target > arr[mid]) {
		    		end = mid - 1;
		    	}
		    	else {
		    		start = mid + 1;
		    	}
		    }
			
		}

		return -1;
	
	}
}


// 18 May 2022.
// 3 Nov 2022.