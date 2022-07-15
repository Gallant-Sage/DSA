import java.util.Arrays;

public class Reversing {
    public static void main(String[] args) {
        int[] target = { 3,7,9 };
        int[] arr = { 3, 7, 11 };

        boolean res = canBeEqual(target, arr);
        System.out.println(res);
    }

    static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        
        for(int i = 0; i < target.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                
                if(arr[j] == target[i]) {
                    return true;
                }
            }
        }
        
        return false;
    }
}