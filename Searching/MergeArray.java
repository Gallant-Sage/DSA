public class MergeArray {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3, n = 2;
		merge(nums1, m, nums2, n);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = 0; i <= n; i++) {

            nums1[m + i] = nums2[i]; 
        }

        for(int j = 0; j <= m + n; j++) {
            System.out.println((nums1[j]));
        }

    }
}