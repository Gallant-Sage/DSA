public class InfiniteArray {
	public static void main(String[] args) {
		
	}

	static int ans(int[] arr, int target) {
        // First find the range.
        // First start with a box of size 2. 
		int start = 0;
		int end = 1;

		while(target < arr[end]) {

			int temp = end + 1; // this is new start.
			
			// double the box value.
			// end = previous end + (size of box) * 2
			// i.e. , [ 1 + (1 - 0 + 1) * 2 ]
			
			end = end + (end - start + 1) * 2;
			start = temp; 

		}
		
		return binarySearch(arr, target, start, end); // something else will be returned here.
	}	 

	static int binarySearch(int[] arr, int target, int start, int end) {

		while(start <= end) {

			int mid = start + (end - start) / 2;

			if(target < nums[mid]) {
				end = mid - 1;
			}
			else if(target > nums[mid]) {
				start = mid + 1;
			}
		}	
	}
}


