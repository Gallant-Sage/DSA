import java.util.Arrays;

public class SortBits {
	public static void main(String[] args) {
		int[] arr = { 0,1,2,3,4,5,6,7,8 };
		System.out.println(Arrays.toString(sortByBits(arr)));
	}

	static int[] sortByBits(int[] arr) {
        
        int[] sortedArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
        	int count = countTotalBits(arr[i]);
        	sortedArr[i] = count;
        }

        Arrays.sort(sortedArr);

        return sortedArr;
    }

    private static int countTotalBits(int n) {
		int count = 0;

		while (n > 0) {
			count++;
			n -= (n & -n);
		}
      
      return count;
	}
}