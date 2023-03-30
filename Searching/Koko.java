// https://leetcode.com/problems/koko-eating-bananas/
import java.util.Arrays;

public class Koko {
	public static void main(String[] args) {
		int[] piles = { 30,11,23,4,20 };
		int h = 5;
		System.out.println(minEatingSpeed(piles, h));
	}

	static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int start = 1;
        int end = piles[piles.length-1];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (totalHours(piles, mid, h)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
    
    static boolean totalHours(int[] piles, int k, int h) {
        int count = 0;

        for (int pile : piles) {
                
            if (pile % k != 0) {
                count += (pile / k) + 1;
            } else {
                count += pile / k;
              }
            
          }
         
        return count <= h;   
    }
}

// [805306368,805306368,805306368]
// 1000000000
// expected o/p : 3
// o/p : 1