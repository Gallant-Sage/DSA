
public class Reverse {
	
	static int reverse(int x) {
        int rev = 0;
        
        if(x < 0) {
            x *= -1;
            while(x > 0) {
                rev = (rev * 10) + (x % 10);
                x /= 10;
            } 
            
            rev *= -1;
        } else {
            while(x > 0) {
                rev = (rev * 10) + (x % 10);
                x /= 10;
            } 
        }


        if(rev < Math.pow(-2, 31) || rev > Math.pow(2, 31) - 1) {
            return 0;
        }
        
        return rev;
    }

	public static void main(String[] args){
		System.out.println(reverse(-123));
	}	
}