// https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive {
	public static void main(String[] args) {
		
	}

	public int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length) {
           
            // In this case , correct = arr[i].
        	
            int correct = arr[i] - 1;
        	if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
        		swap(arr, i, correct);
        	}
        	else {
        		i++;
        	}
        }

        for(int index = 0; index < arr.length; index++) {
        	if(arr[index] != index + 1) {
        		return index + 1;
        	}
        }

        // Case 2 :
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
    	int temp = arr[first];
    	arr[first] = arr[second];
    	arr[second] = temp;
    }
}
        