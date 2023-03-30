// 

import java.util.Arrays;
public class SingleElement {
	public static void main(String[] args) {
		int[] nums = { 1,1,2,3,3,4,4,8,8 };
		System.out.println(singleNonDuplicate(nums));
	}

	static int singleNonDuplicate(int[] nums) {
		int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

           if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                start = mid + 1;
            }

            else {
            	end = mid; // not mid - 1 , else at nums[0] the end will be at -1 index.
            }
        }            
        
        return nums[start];
    }
}
    

// Example :
// nums = [1, 1, 2, 3, 3, 4, 4, 8, 8]

// Here we can see that 2 is the number which appears once and all the other number appears twice.

// If all the number would have appeared twice in nums in the above example then array would have looked like this -

// nums = [1, 1, 2, 2, 3, 3, 4, 4, 8, 8]
// 		0  1  2  3  4  5  6  7  8  9
// The thing to notice here is that each number is present on an even index and it's duplicate is present on an odd index. This pattern will help in finding the single number.

// And in the given nums, since 2 is present only one time, the above pattern is distorted after the number 2.

// nums = [1, 1, 2, 3, 3, 4, 4, 8, 8]
// 		0  1  2  3  4  5  6  7  8  
// So here binary search technique can be applied.

// Find the middle index of the list.
// Check if middle index is even or odd.
// If it's even, the number at middle index should be equal to the next number. (from the above pattern)
// If it's odd, the number at middle index should be equal to the previous number. (from the above pattern)
// If any of the above condition is satisfied, then the numbers before mid follows the pattern and hence single element must exist after mid.
// Reduce the list to number after mid by moving low pointer to mid+1.
// If the condition is not statisfied that means the pattern is distorted before mid and hence single element must exist before mid.
// Reduce the list to number before mid by moving high pointer to mid.