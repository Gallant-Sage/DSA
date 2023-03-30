public class PerfectSquare {
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(100));
	}

	static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;

        while(start <= end) {  
        	long mid = (start + end ) / 2;
        	long midsqr = mid * mid;

        		if (midsqr == num) {
        			return true;
        		} else if (midsqr > num) {
        			end = mid - 1;
        		} else {
        			start = mid + 1;
        		}
        }

        return false;
    }
}  
