// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google Queestion
import java.util.*;
public class AllDisappearedNum {
	public static void main(String[] args) {
		
	}

	static List<Integer> findDisappearedNumbers(int[] nums) {
		int i = 0;
        while(i < nums.length) {
           
            int correct = nums[i] - 1;
        	if(nums[i] < nums.length && nums[i] != nums[correct]) {
        		swap(nums, i, correct);
        	}
        	else {
        		i++;
            }
        }

        List<Integer> ans = new ArrayList<>(); 
        	for(int index = 0; index < nums.length; index++) {
        		if(nums[index] != index + 1) {
        			  ans.add(index + 1);
        		}
        	}


        return ans;
	}

	static void swap(int[] arr, int first, int second) {
    	int temp = arr[first];
    	arr[first] = arr[second];
    	arr[second] = temp;
    }
}

// If range --> [0, n]
// * Every element will be at, index = value
// If range --> [1, n]
// * Every element will be at, index = value - 1
