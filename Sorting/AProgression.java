import java.util.Arrays;

public class AProgression {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5  };
		boolean res = canMakeArithmeticProgression(arr);

		System.out.println(res);
	}

	static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        
        for(int i = 0; i < arr.length - 1; i++) {
            
            if((arr[i + 1] - arr[i]) != diff) {
                return false;
            }
        }
        
        return true;
    }
}