// https://leetcode.com/problems/middle-of-the-linked-list/description/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Middle {
    static ListNode middleNode(ListNode head) {
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;

        while(fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }

        return slow_ptr;
    }
    
    public static void main(String[] args) {
        
    }
}