import java.util.HashMap;

class Sliding {
    public static void main(String[] args) {
        // int[] input = { 4, 2, 2, 7, 8, 1, 2, 8, 1, 0 };
        // System.out.println(smallestSubarray(8, input));

        int[] input2 = { 2, 3, 1, 2, 4, 3 };
        System.out.println(minSubArrayLen(7, input2));
    }

    public static int smallestSubarray(int targetSum, int[] arr) {
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentWindowSum += arr[windowEnd];

            while (currentWindowSum >= targetSum) {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                currentWindowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return minWindowSize;
    }

    // https://leetcode.com/problems/longest-substring-without-repeating-characters/
    // This problem utilizes a set/map + sliding window technique
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> chars = new HashMap<>();

        int left = 0;
        int right = 0;
        int res = 0;

        while (right < s.length()) {
            char r = s.charAt(right);
            chars.put(r, chars.getOrDefault(r, 0) + 1);

            while (chars.get(r) > 1) {
                char l = s.charAt(left);
                chars.put(l, chars.get(l) - 1);
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }

        return res;
    }

    // https://leetcode.com/problems/minimum-size-subarray-sum/submissions/
    public static int minSubArrayLen(int target, int[] nums) {
        // we have to keep minSize this & not 0. bcoz if we assign it w/ a 0
        // Math.min(minSize, end - start + 1) will always give 0.
        int minSize = Integer.MAX_VALUE;
        int currSum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            currSum += nums[end];

            while (currSum >= target) {
                minSize = Math.min(minSize, end - start + 1);
                currSum = currSum - nums[start];
                start++;
            }
        }

        // we have to put this check over here bcoz if minSize is 0 means there is no
        // subarray
        // w/ sum equals to target then returned value will be equal to
        // Integer.MAX_VALUE
        return (minSize != Integer.MAX_VALUE) ? minSize : 0;
    }

    // not working code
    public static int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int minCards = Integer.MAX_VALUE;

        for (int right = 0; right < cards.length; right++) {
            map.put(cards[right], map.getOrDefault(cards[right], 1) + 1);

            while (map.get(cards[right]) > 1) {
                minCards = Math.min(minCards, right - left + 1);
                left++;
            }
        }

        return (minCards != Integer.MAX_VALUE) ? minCards : -1;
    }

    // working code
    // https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up
    public int minimumCardPickup2(int[] cards) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minCards = Integer.MAX_VALUE;

        for (int right = 0; right < cards.length; right++) {
            if (map.containsKey(cards[right])) {
                minCards = Math.min(minCards, (right + 1) - map.get(cards[right]));
            }

            map.put(cards[right], right);
        }

        return (minCards != Integer.MAX_VALUE) ? minCards : -1;
    }
}