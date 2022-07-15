// https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.Arrays;
public class Intersection {
	public static void main(String[] args) {
		int[] arr1 = { 4, 9, 5 };
		int[] arr2 = { 9, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(intersection(arr1, arr2)));
	}

	static int[] intersection(int[] nums1, int[] nums2) {
        
        int count = 0;
        int[] newArr = new int[nums1.length + nums2.length];
        
        for (int i = 0; i < nums1.length; i++) {
        	for (int j = 0; j < nums2.length; j++) {
        		if (nums1[i] == nums2[j]) {
        			
        			if (newArr[count] != nums1[i]) {
        				newArr[count] = nums1[i];
        			}

        			count++;
        		}
        	}
        }

        return newArr;
    }
}