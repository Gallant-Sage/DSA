import java.util.Arrays;
public class ParityTwo {
	public static void main(String[] args) {
		int[] arr = { 4,2,5,7 };
		System.out.println(Arrays.toString(sortArrayByParityII(arr)));
	}

	static int[] sortArrayByParityII(int[] nums) {
        
        int i = 0;
        int j = 1;

        while(i < nums.length || j < nums.length) {
        	
        	if(i % 2 == 0) {
        		i += 2;
        	} else {
        		swap(nums, i, j);
        		j += 2;
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