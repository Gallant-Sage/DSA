// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// (Medium)
// Q34

import java.util.Arrays;
public class FirstAndLastPosition {
	public static void main(String[] args) {
		 
		 int[] nums = { 5,7,7,8,8,10 }; 
		 int target = 8;
         System.out.print(Arrays.toString(searchRange(nums, target)));

	}

	public static int[] searchRange(int[] nums, int target) {
        
	    int[] ans = { -1, -1 };
	    
	    // Check for first occurence of target.(1st binary search)
	    ans[0] = search(nums, target, true);
	    
	    if (ans[0] != -1) {
	    	// Check for last occurence.(2nd binary search)
	    	ans[1] = search(nums, target, false);
	    }
	    
	    return ans;
	}
		 
	public static int search(int[] nums, int target, boolean findStartIndex) {
		
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;

		while(start <= end) {

			int mid = start + (end - start) / 2;

			if(target < nums[mid]) {
				end = mid - 1;
			}
			else if(target > nums[mid]) {
				start = mid + 1;
			}
			else {
                
                // potential ans found.
				ans = mid;
				if(findStartIndex) {
					// To search for first occurence
					end = mid - 1;
				}
				else {
					// To search for last occurence
					start = mid + 1;
				}
			
			}
		}

		return ans;

	}
}
				

// 31 Jan 2022
// 16 May 2022
// 30 Oct 2022

// bruteforce method => start searching from start(this will be first ind) + start searching from back(last ind)
// => in this case time-complexity will be O(n)

// optimized way => we can apply binary search two times, first to get the answer & second time to check if it's
 // the first/last occurence.
// [5, 7, 7, 7, 7, 8, 8, 10], tar = 7
// in this case mid will be, ind = 3. but there maybe be 7's before it and after it as well 
// so to check 7's before it => end = mid - 1 && 7's after it => start = mid + 1


	
