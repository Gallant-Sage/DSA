public class Power {
	public static void main(String[] args) {
		System.out.println(myPow(2.00000, -2));
	}

	static  double myPow(double x, int n) {
        
        double ans = 1.00000;
        if(n == 0) {
            return 1;
        }
        
        if(n > 0) {
            for(int i = 1; i <= n; i++) {
                ans = ans * x;
            }
        }
        
        if(n < 0) {
            for(int i = 1; i <= n; i++) {
                ans = ans * (1.00000 / x);
            }
        }
       
        return ans; 
    }
}