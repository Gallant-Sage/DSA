// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while(temp != null) {
            // was not working without this condition
            // giving --> null pointer exception
            if(temp.next == null) {
                break;
            }

            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        
    }
}
        
