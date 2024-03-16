class Pivot {
	public static void main(String[] args) {
		// int[] nums = {1, 7, 3, 6, 5, 6};
		// System.out.println(pivotIndex(nums));

		int[] nums = {1, 2, 3, 4};
		productExceptSelf(nums);
	}

	public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) {
        	sum += x;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) {
                System.out.println("last " + leftsum);
                System.out.println("last sum " + sum);
            	System.out.println("last sum " + nums[i]);
                return i;
            }
            
            System.out.println("index" + i);
            leftsum += nums[i];
            System.out.println(leftsum);
            
        }
        
        return -1;
    }

    // https://leetcode.com/problems/product-of-array-except-self/
    public static void productExceptSelf(int[] nums) {
    	
    	int N = nums.length;
    	int[] ans = new int[N];

    	for (int i=0; i<N; i++) {
    		int prod = 1;

    		for (int j=0; j<N; j++) {
    			if (i == j) {
    				continue;
    			}

    			prod *= nums[j]; 
    		}

    		ans[i] = prod;
    		System.out.println(ans[i]);
    	}
    }
}