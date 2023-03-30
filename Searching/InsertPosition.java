public class InsertPosition {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		System.out.println(searchInsert(nums, target));
	}

    static  int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
            
                return mid;
            
            } else if (nums[mid] < target) {
                
                start = mid + 1;
            
            } else {
                
                end = mid - 1;
            
            }
        }

        return search(nums, target, 0, nums.length); 
    }

    static int search(int[] nums, int target, int start, int end) {
        if (start > target) {
            return start;
        }

        if (end < target) {
            return end;
        }
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                if (nums[mid - 1] < target) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            }

            if (nums[mid] < target) {
                if (nums[mid + 1] > target) {
                    return mid + 1;
                } else {
                    end = mid;
                }
            }
            
        }

        return -1;
    }
}    