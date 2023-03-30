// https://leetcode.com/problems/arranging-coins/submissions/

public class Coins {
	public static void main(String[] args) {
		System.out.println(arrangeCoins(5));
	}

	static int arrangeCoins(int n) {
		int start = 1;
		int end = n;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(mid > mid - 1) {
				start = mid + 1;
			} else {
				return mid - 1;
			}
		}

		return -1;
	}
}


// class Solution {
//     public int arrangeCoins(int n) {
        
//         int count = 0;
        
//         if(n == 1) {
//             return 1;
//         }
        
//         for(int i = 1; i <= n; i++) {
            
//             if(n >= i) {
//                 n -= i;
//                 count++;
//             }
//         }
        
//         return count;
//     }
// }