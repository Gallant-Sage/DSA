public class Koko {
	public static void main(String[] args) {
		int[] piles = { 3, 6, 7, 11 };
		int h = 8;
		System.out.println(minEatingSpeed(piles, h));
	}

	static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = piles[piles.length - 1];
        int sum = 0;

        for (int pile : piles) {
        	sum += pile;
        }

        while (start < end) {
        	int mid = start + (end - start) / 2;
        	
        	if (mid <= h) {
        	 	end = mid;start = mid + 1;
        	} else {
        	 	end = mid;
            }
        }

        return start; // or end as well.
    }
}
