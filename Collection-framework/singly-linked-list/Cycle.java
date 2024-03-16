// https://leetcode.com/problems/linked-list-cycle/description/
import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
}
 
public class Cycle {
    static boolean hasCycle(ListNode head) {
        HashSet<ListNode> h = new HashSet<>();

        while(head != null) {
            if(h.contains(head)) 
                return true;

            h.add(head);
            head = head.next;    
        } 

        return false;
    }

    public static void main(String[] args) {
        
    }
}