import java.util.Stack;

// https://leetcode.com/problems/palindrome-linked-list/description/

class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class Palindrome {
    static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        Stack<Integer> s = new Stack<>();
        boolean isPalin = true;

        while(slow != null) {
            s.push(slow.val);
            slow = slow.next;
        }

        while(head != null) {
            int i = s.pop();
            if(head.val == i) {
                isPalin = true;
            } else {
                isPalin = false;
                break;
            }

            head = head.next;
        }

        return isPalin;
    }

    public static void main(String[] args) {
        
    }
}