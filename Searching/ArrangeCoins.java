// https://leetcode.com/problems/arranging-coins/

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(3));
    }

    public static int arrangeCoins(int n) {
        int count = 0;
        if(n == 1) {
            return 1;
        }
        
        for(int i = 1; i <= n; i++) {
            
            if(n >= i) {
                n -= i;
                count++;
            }
        }
        
        return count;
    }
}
        
// 4 Nov 2022