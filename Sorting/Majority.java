public class Majority {
    static int majorityElement(int[] nums) {
        int count = 0;
        int majorElement = -1;
        
        for(int i=0; i<nums.length; i++) {
            
            if(count == 0) {
                majorElement = nums[i];
            }
            
            if(nums[i] == majorElement) {
                count++;
            } else {
                count--;
            }
        }
        
        return majorElement;
    }
}
            