public class Hamming {
	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));
	}

	public static int hammingDistance(int x, int y) {
        
        int count = 0;
        int n = x ^ y;
        
        while(n > 0) {
           
            if((n & 1) == 1) {
                count++;
            }
            
            n = n >> 1;
        }
        
        return count;
    }
}