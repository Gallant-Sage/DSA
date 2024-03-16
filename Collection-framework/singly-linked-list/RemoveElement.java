// https://leetcode.com/problems/remove-linked-list-elements/description/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveElement {
	public static ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}

		ListNode ptr = head;

		while (ptr.next != null) {
			if (ptr.next.val == val) {
				ptr.next = ptr.next.next;
			} else {
				ptr = ptr.next;
			}
		}

		// without this statement the case of [7,7,7,7] won't be solved.
		// [7] will always be left in the linkedlist if we don't use this statement.
		return head.val == val ? head.next : head;
	}

	public static void main(String[] args) {
		
	}
}