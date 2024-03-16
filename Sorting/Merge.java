
import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		
		int[] arr = { 5, 4, 3, 2, 1 };
		arr = mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static int[] mergeSort(int[] arr) {

		if(arr.length == 1) {
			return arr;
		}

		int mid = arr.length / 2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		System.out.print("Left : " + Arrays.toString(left) + " ");
		System.out.println();
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		System.out.print("Right : " + Arrays.toString(right) + " ");

		return mergedArray(left, right);
	}

	static int[] mergedArray(int[] first, int[] second) {
		
		int[] mix = new int[first.length + second.length];
		
		int i = 0;
		int j = 0;
		int k = 0;

		while(i < first.length && j < second.length) {
			
			if (first[i] < second[j]) {
				mix[k] = first[i];
				i++;
			}

			else {
				mix[k] = second[j];
			    j++;
			}

			k++;
		}

		// It maybe possible that some elements are   
		// remaining in any one of the two arrays.
		// arr1 = [5, 3, 4], arr2 = [6, 8, 10, 19, 32]

		while(i < first.length) {
			mix[k] = first[i];
			i++;
			k++;
		}

		while(j < second.length) {
			mix[k] = second[j];
			j++;
			k++;
		}

		return mix;

	}
}

