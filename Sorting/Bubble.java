import java.util.Arrays;
public class Bubble {
	public static void main(String[] args) {
		int[] arr = { -1,7,-32,0,89 };
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void bubble(int[] arr) {
		boolean swapped;
		// runs n-1 times.
		// i --> pass, ( 0th, 1st, 2nd.... pass )
        
        for (int i = 0; i < arr.length; i++) {
        	swapped = false;
        	// for each step, max item will come at last respective index.
        	for (int j = 1; j < arr.length - i; j++) {
        		// swapping.
        		if(arr[j] < arr[j-1]) {

        			int temp = arr[j];
        			arr[j] = arr[j-1];
        			arr[j-1] = temp;
        			swapped = true;
        		
        		}
        	}

        	// if you did not swap for a particular value of i, it means the array is sorted hence stop the program.
        	// swapped == false
        	if (!swapped) {
        		break;
        	}
        }
	}
}

// Also known as Sinking or Exchange Sort.
// Best case --> O(n) , when arr is sorted.
// Worst Case --> O(n^2) , when arr is sorted in descending.
// Stable Algo
// Inplace Sorting Algo's --> No extra space req, i.e. copying the array etc. => O(1) space complexity