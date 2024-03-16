public class DNSolution {
	public static void main(String[] args) {
		
	}


	public int findDuplicate(int[] arr) {
		int i = 0;
		
        if(arr[i] != i + 1) {
          while(i < arr.length) {
        	int correct = arr[i] - 1;
        	if(arr[i] != arr[correct]) {
        		swap(arr, i, correct);
        	}
        	else {
        		return arr[i];
        	}
          }
        }
        else {
        	i++;
        }

        return -1;

	}

	static void swap(int[] arr, int first, int second) {
    	int temp = arr[first];
    	arr[first] = arr[second];
    	arr[second] = temp;
    }
}