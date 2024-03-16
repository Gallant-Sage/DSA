import java.util.Arrays;


public class Rotate {
	
	static void rotate(int[] nums, int k) {
		int[] newNums = new int[nums.length];

		for (int i = 0; i < newNums.length; i++) {
			if ((i+k) >= newNums.length ) {
				newNums[i - k + 1] = nums[i];
			} else {
				newNums[i + k] = nums[i];
			}
		}	

		System.out.println(Arrays.toString(newNums));
	}

	public static void main(String[] args){
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

		rotate(nums, 3);
	}	
}