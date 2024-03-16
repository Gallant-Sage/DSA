import java.util.Arrays;
import java.io.*;

public class Solution {
	public static void main(String[] args) {
		// System.out.println(lengthOfString("GEEKSFORGEEKS", 0));
		// System.out.println(len("aabd"));

		// printNos(100);

		int A[] = {1, 4, 45, 6, -50, 10, 2};
        int n1 = A.length;

        // System.out.println(findMin(A, n));
        // System.out.println(findMax(A, n));

        int arr[] = { 20, 23, 23, 45, 78, 88 };
        int n2 = arr.length-1;

        // System.out.println(sortedOrNot(arr, n));

        isPowerOfThree(27);

        int[] arr1 = { 1, 2, 3, 4, 5 };
		sumOfTriangle(arr1);

		String str = "geeksforGeeKS";
        char res = first(str,0);
        if (res == 0)
            System.out.println("No uppercase letter");
        else
            System.out.println (res);
	}
    
    //     factorial
	static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}
        
    // fibonacci series    
    static long fiboFormula(int n) {
		return (long)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
	}

	static int fibo(int n) {
		
		if(n < 2) {
			return n;
		}
		
		return fibo(n - 1) + fibo(n - 2);
	}
    
	// https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
	static int lengthOfString(String str, int len) {
		if (str.length() == 0) {
			return len;
		}

		return lengthOfString(str.substring(1), len + 1);

	}

    static int len(String str) {
 
        if (str.equals("")) {
            return 0;
        }

        else
            return len(str.substring(1)) + 1;
    }

    // prints 1 to n
    static void printNos(int N) {
        
        if(N > 0) {
            printNos(N - 1);
            System.out.print(N + " ");
        }
       
      return;
    }

    // https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
    public static int findMin(int[] A, int n) {
		if (n == 1) {
			return A[0];
		}

		return Math.min(A[n-1], findMin(A, n-1));
	}

	public static int findMax(int[] A, int n) {
		if (n == 1) {
			return A[0];
		}

		return Math.max(A[n-1], findMax(A, n-1));
	}

	// If array is sorted or not
	public static boolean sortedOrNot(int[] arr, int n) {
		if(n == 1 || n == 0) return true;

		return arr[n] >= arr[n-1] && sortedOrNot(arr, n-1);
	}

	// Power of 2
	static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        if (n % 2 != 0) {
        	return false;
        }
        
        return isPowerOfTwo(n / 2);
    }

	// Power of 3
	static boolean isPowerOfThree(int n) {
		if (n == 0) {
			return false;
		}

		if (n == 1) {
			return true;
		}

		if (n % 3 != 0) {
			return false;
		}

		return isPowerOfThree(n / 3);

	}

	// https://www.geeksforgeeks.org/sum-triangle-from-array/
	static void sumOfTriangle(int[] arr) {
		
		if (arr.length < 1) {
			return;
		}
		
		int[] newArr = new int[arr.length-1];
		for (int i = 0; i < arr.length - 1; i++) {
			newArr[i] = arr[i] + arr[i+1];
		}

		// Make a recursive call and pass
        // the newly created array
		sumOfTriangle(newArr);
		
		// Print current array in the end so
        // that smaller arrays are printed first
		System.out.println(Arrays.toString(arr));
	}

	// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
	public static char first(String str, int i) {
		if(str.charAt(i)=='\0'){
            return 0;
        }

        if (Character.isUpperCase(str.charAt(i))) {
			return str.charAt(i);
		}

		return first(str, i+1);
	}
}
