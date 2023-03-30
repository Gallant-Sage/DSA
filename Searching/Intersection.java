// https://leetcode.com/problems/intersection-of-two-arrays/
// Q-349

import java.util.Arrays;
class Intersection {
    public static void main(String[] args) {
    	int[] num1 = {1, 2, 2, 1};
    	int[] num2 = {2, 2};
    }

    static int[] count(int nums[]) {
        // count = { 0, 0, 0, 0, 0, 0, 0, 0 ....... till index 1000}
        int count[]=new int[1001];
        for(int num:nums) {
            count[num]++;
        }
        
        return count;
    }
    
    static int[] intersection(int[] nums1, int[] nums2) {
        
        if(nums1==null||nums2==null) {
        	return new int[]{};
        }
        
        // [0, 2, 2, 0, 0, ........]
        int countNums1[]=count(nums1);
        // [0, 0, 2, 0, 0, ........]
        int countNums2[]=count(nums2);
        int count = 0;
        
        for(int i=0;i<countNums1.length;i++) {
            if(countNums1[i] > 0 && countNums2[i] > 0)
                count++;
        }

        int ans[]=new int[count];
        int k=0;
        
        for(int i=0;i<countNums1.length;i++) {
            if(countNums1[i] > 0 && countNums2[i] > 0) {
            	ans[k++]=i;
            }
        }
        
        return ans;
    }
}