public class OrderAgnosticBinary {
	public static void main(String[] args) {
		
		int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22 }; 
	   int target = 11;
	   int result = binarySearch(arr, target);
	   System.out.println(result);
	
	}
	
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
        
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
			

			    
