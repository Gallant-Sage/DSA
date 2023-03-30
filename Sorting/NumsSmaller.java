import java.util.Arrays;

public class NumsSmaller {
	public static void main(String[] args) {
		
		int[] arr = { 8,1,2,2,3 };
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
	
	}

	static int[] smallerNumbersThanCurrent(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			int rank = 0;

			for(int j = 0; j < arr.length; j++) {
				
				if(arr[i] > arr[j] && i != j ) {
					rank++;
				}
			}

			arr[i] = rank;
			System.out.println(arr[i]);
		}

		return arr;
    }
}