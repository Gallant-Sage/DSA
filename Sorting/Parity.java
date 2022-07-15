import java.util.Arrays;
public class Parity {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(arr));
	}

	static int[] sortArrayByParity(int[] nums) {
        
        int i = 0;
        int j = nums.length - 1;

        
        while(i <= j) {
        	
        	if(nums[i] % 2 == 0) {
        		
        		i++;
        	} else {
        		swap(nums, i, j);
        		j--;
        	}
        }

        return nums;
    }

    static void swap(int[] arr, int index1, int index2) {
        		
        	int temp = arr[index1];
        	arr[index1] = arr[index2];
        	arr[index2] = temp;
    }

}

        

