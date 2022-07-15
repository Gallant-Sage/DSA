import java.lang.*;
import java.util.Arrays;

public class MaxProduct {
	public static void main(String[] args) {
		int[] nums = { 3,7 };
		System.out.println(maxProduct(nums));
	}

	static int maxProduct(int[] nums) {
            
            
            Arrays.sort(nums);
        
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}