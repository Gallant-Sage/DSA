import java.util.Arrays;
public class Merge {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		mergeArrays(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
	}

	static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i > - 1 && j > -1) {
        	
        	if(nums1[i] > nums2[j]) {
        		nums1[k] = nums1[i];
        		i--;
        	} else {
        		nums1[k] = nums2[j];
        		j--;
        	}

        	k--;
        }

        while(i > -1) {
        	nums1[k] = nums2[i];
        	i--;
        	k--;
        }

        while(j>-1) {
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}
