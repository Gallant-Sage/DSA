import java.util.Arrays;
public class TwoSum {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}

	static int[] twoSum(int[] numbers, int target) {
        
        int start = 0;
        int end = (numbers.length - 1);

        while(numbers[start] + numbers[end] != target) {
        	
        	if (numbers[start] + numbers[end] < target) {
        		start++;
        	} else if (numbers[start] + numbers[end] > target) {
        		end--;
        	}
        }

        int[] ans = { start + 1, end + 1 };
        return ans;
    }
}

// 4 Nov 2022.

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Leetcode(medium)

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int start = 0;
//         int end = numbers.length-1;
        
//         while(start < end) {
//             int sum = numbers[start] + numbers[end];
            
//             if(target == sum) {
//                 return new int[] {start + 1  , end + 1};
//             }
            
//             if(target > sum) {
//                 start ++;
//             }
            
//             else {
//                 end--;
//             }
//         }
        
//         return null;
//     }
// }