// https://www.geeksforgeeks.org/sum-triangle-from-array/

import java.util.Arrays;

public class TriangleSum {
	
	static void sumOfTriangle(int[] arr) {
		if (arr.length == 1) {
			return;
		}
		
		int[] newArr = new int[arr.length-1];

		for (int i = 0; i < arr.length - 1; i++) {
			
			newArr[i] = arr[i] + arr[i+1];
		
		}

		sumOfTriangle(newArr);

		System.out.println(Arrays.toString(newArr));
	}

	public static void main(String[] args){
		int[] arr = { 1, 2, 3, 4, 5 };
		sumOfTriangle(arr);
	}	
}