public class SquareRoot {
	public static void main(String[] args) {
		System.out.println(mySqrt(144));
	}

	static int mySqrt(int x) {
        int start = 0;
        int end = x;
        return Sqrt(x, start, end);
    }

    static int Sqrt(int x, int start, int end) {
    	int mid = start + (end - start) / 2;; 
    	while(start < end) {
            if (mid * mid >= x) {
            	end = mid;
            	mid = start + (end - start) / 2;
            } else if (mid * mid < x) {
            	start = mid + 1;
            	mid = start + (end - start) / 2;
            }
    
    	}
        
        return mid;
    }
}