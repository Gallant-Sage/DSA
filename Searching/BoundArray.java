// https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/

public class BoundArray {
	public static void main(String[] args) {
		System.out.println(maxValue(4, 2, 6));
	}

	static int maxValue(int n, int index, int maxSum) {
        int[] arr = new int[n];
        int sum = 0;
        arr[index] = maxSum;

        for (int i = 0; i < arr.length; i++) {
        	
        }
        

        return arr[index];
    }
}
        			