import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MinAbsolute {
	public static void main(String[] args) {
		int[] arr = { 4,2,1,3 };
        System.out.println(minimumAbsDifference(arr));
	}

	static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int absoluteDiff = arr[1] - arr[0];

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < arr.length - 1; i++) {
         	
         	if(arr[i + 1] - arr[i] == absoluteDiff) {
         		list.add(Arrays.asList(arr[i], arr[i + 1]));
         	}
        } 

        return list;
    }
}