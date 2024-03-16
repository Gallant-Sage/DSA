// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/

class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DeleteMiddle {
    public ListNode deleteMiddleOne(ListNode head) {
        ListNode prev = head;
        int len = 0;

        if(head.next == null) {
            return null;
        }
        
        while(prev != null) {
            prev = prev.next;
            len++;
        }

        prev = head;
        for(int i = 0; i < len/2 - 1; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;

        return head;
    }

    // alternate way: 
    // --------------
    public ListNode deleteMiddleTwo(ListNode head) {
        ListNode slow_ptr = head;
        ListNode fast_ptr = head;
        ListNode temp = null;

        if(head.next == null) {
            return null;
        }

        while(fast_ptr != null && fast_ptr.next != null) {
            temp = slow_ptr;
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        
        temp.next = slow_ptr.next;
        return head;
    }

    public static void main(String[] args) {
        
    }
}
