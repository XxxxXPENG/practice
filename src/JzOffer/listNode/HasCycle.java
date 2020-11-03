package JzOffer.listNode;

public class HasCycle {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode quick = slow == null ? null : head.next;
        while (quick != null && quick.next != null) {
            if(slow == quick) return true;
            slow = slow.next;
            quick = quick.next.next;
        }
        return false;
    }
}
