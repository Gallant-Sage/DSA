// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Q-852(Medium)

public class MountainArray {
	public static void main(String[] args) {
		
		int arr[] = { 0, 1, 2, 4, 6, 3, 1, 0 };
		System.out.println(peakIndexInMountainArray(arr));
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
}


// This type of array is also known as Bitonic array.

// 2 Feb 2022 
// 16 May 2022
// 30 Oct 2022