// Q-26 leetcode

public class Duplicate {
    public static int removeDuplicates2(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i-1])
                nums[i++] = n;
        return i;
    }

    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for(int i = 1; i < nums.length; i++){
            
            // We skip to next index if we see a duplicate element
            if(nums[i - 1] != nums[i]) {
                
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                nums[insertIndex] = nums[i];     
                insertIndex++;
            }
        }
        
        return insertIndex;
    }
}
