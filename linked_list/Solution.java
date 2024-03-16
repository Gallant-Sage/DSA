import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    
    public ListNode () {

    }

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
	public static void main(String[] args) {
		
	}

	// https://leetcode.com/problems/linked-list-cycle/

	// ALways use Fast & Slow pointer approach in cycle detection questions.
	public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public static int cycleLength(ListNode head) {
    	ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode temp = slow;
                int length = 0;
                do {
                	temp = temp.next;
                	length++;
                } while (temp != slow); 
                	return length;
            }
        }

        return 0;
    }

    // https://leetcode.com/problems/linked-list-cycle-ii/
    
    // https://leetcode.com/problems/linked-list-cycle-ii/
    // Approach => (1) find length of cycle
    // 			   (2) move s by length of cycle times
    //  		   (3) move s & f one by one, it will meet at start(of cycle).

    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = cycleLength(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    // https://leetcode.com/problems/happy-number/
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
        	slow = findSquare(slow);
        	fast = findSquare(findSquare(slow));
        } while (fast != slow);

        if (slow == 1) {
        	return true;
        }

        return false;
    }

    private static int findSquare(int number) {
    	int ans = 0;

    	while (number > 0) {
    		int rem = number % 10;
    		ans += rem * rem;
    		number /= 10;
    	}

    	return ans;
    }

    // https://leetcode.com/problems/sort-list/
    // yet to learn.
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
        	return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
    	ListNode dummyHead = new ListNode();
    	ListNode tail = dummyHead;

    	while (list1 != null && list2 != null) {
    		if (list1.val < list2.val) {
    			tail.next = list1;
    			list1 = list1.next;
    			tail = tail.next;
    		} else {
    			tail.next = list2;
    			list2 = list2.next;
    			tail = tail.next;
    		}
    	}

    	tail.next = (list1 != null) ? list1 : list2;

    	return dummyHead.next;
    }

    ListNode getMid(ListNode head) {
    	ListNode midPrev = null;

    	while (head != null && head.next != null) {
    		midPrev = (midPrev == null) ? head : midPrev.next;
    		head = head.next.next;
    	}

    	ListNode mid = midPrev.next;
    	midPrev.next = null;

    	return mid;
    }

    // https://leetcode.com/problems/reverse-linked-list/
    // public ListNode reverseList(ListNode head) {

    // }

    // https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

    // https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list
    // 1.Using ArrayList
    public int pairSum(ListNode head) {
        ListNode current = head;
        
        // I could've done this using an array but for that i have to use
        // an extra while loop for finding size of list so i can declare
        // the array of same size as of the list.So instead i used the
        // dynamic array(arraylist).
        List<Integer> values = new ArrayList<>();

        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        int i = 0; int j = values.size() - 1;
        int maxPairSum = 0;
        while (i < j) {
            maxPairSum = Math.max(maxPairSum, values.get(i) + values.get(j));
            i++;
            j--;
        }

        return maxPairSum;
    }

    // 2.Using Stack
    public int pairSum2(ListNode head) {
        ListNode current = head;
        Stack<Integer> st = new Stack<Integer>();

        while (current != null) {
            st.push(current.val);
            current = current.next;
        }

        current = head;
        int size = st.size(), count = 1;
        int maxPairSum = 0;
        while (count <= size / 2) {
            maxPairSum = Math.max(maxPairSum, current.val + st.peek());
            current = current.next;
            st.pop();
            count++;
        }

        return maxPairSum;
    }

    // 3.By reversing 2nd half of LL.
    public int pairSum3(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Get middle of the linked list.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse second half of the linked list.
        ListNode nextNode, prev = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        ListNode start = head;
        int maximumSum = 0;
        while (prev != null) {
            maximumSum = Math.max(maximumSum, start.val + prev.val);
            prev = prev.next;
            start = start.next;
        }

        return maximumSum;
    }
}