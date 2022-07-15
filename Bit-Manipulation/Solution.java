public class Solution {
    
    public static void main(String[] args) {
        System.out.println(hammingWeight(10));
    }
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        
        int count = 0;
        if((n & 1) == 1) {
            count++;
            n = n >> 1;
        }
        
        return count;
    }
}
        