import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
	val = x;
    next = null;
    }
}

public class Practice {
	public static void main(String[] args) {
		int[] nums = { 7, 5, 10, 9, 6 };
        System.out.println(subsequenceSum(nums));
	}

	public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
        	slow = findSquare(slow);
        	fast = findSquare(findSquare(fast));
        } while (fast != slow);
          
        if (slow == 1) {
        	return true;
        }

        return false;  
    }

    private static int findSquare(int num) {
    	int ans = 0;

    	while (num > 0) {
    		int rem = num % 10;
    		ans += rem * rem;
    		num /= 10;
    	}

    	return ans;
    }

     // To find mid of any linkedlist.
    private ListNode middleNode(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
    	ListNode fast = head;
		int length = 0;
    	
    	while (fast != null && fast.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;

    		if (fast == slow) {
    			length = cycleLength(slow);
    			break;
    		}
    	}

    	if (length == 0) {
    		return null;
    	}

    	ListNode f = head;
    	ListNode s = head;
    	
    	while (length > 0) {
    		s = s.next;
    		length--;
    	}

    	while (f != s) {
    		s = s.next;
    		f = f.next;
    	}

    	return s;
    }

    private static int cycleLength(ListNode head) {
    	int length = 0;

    	ListNode slow = head;
    	ListNode fast = head;

    	while (fast != null && fast.next != null) {
    		slow = slow.next;
        	fast = fast.next.next;
  
        	if (slow == fast) {
        		ListNode temp = slow;

        		do {
        			temp = temp.next;
        			length++;
        		} while (temp != fast);
        	}
    	}

    	return length;
    }

    // https://leetcode.com/problems/reverse-linked-list/
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    // https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        for (int i = 0; i< left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode last = prev;
        ListNode newEnd = curr;
        ListNode next = curr.next;

        for (int i = 0; i < right - left + 1; i++) {
            curr.next = prev;
            prev = curr;
            curr = next;

            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = curr;

        return head;
    }

    // https://leetcode.com/problems/reorder-list/
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = middleNode(head);

        ListNode hs = reverseList(mid);
        ListNode hf = head;

        // rearrange
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // next of tail to null
        if (hf != null) {
            hf.next = null;
        }
    }

    public static int subsequenceSum(int[] nums) {
        int window = 0;
        int sum = 0;
        int k = 2;
        int max = 0;

        while (k <= nums.length) {
            sum = 0;
            for (int i=window; i<k; i++) {
                sum += nums[i];
            }
            max = Math.max(max, sum);
            window++;
            k++;
            // System.out.println("Sum : " + sum);
        }

        return max;
    }
}