import java.util.HashMap;

class Solution  {
	public static void main(String[] args) {
		// romanToInt("MCMXCIV");

		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}

	// https://leetcode.com/problems/roman-to-integer/
	public static int romanToInt(String s) {
    
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            } else {
                answer += number;
            }
            
            prev = number;
            System.out.println(prev);
        }
    
        return answer;
    }

    // https://leetcode.com/problems/contains-duplicate
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {
                return true;
            }
        }

        return false;
    }
}