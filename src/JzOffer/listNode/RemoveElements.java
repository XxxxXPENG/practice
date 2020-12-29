package JzOffer.listNode;

public class RemoveElements {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    //[1,2,6,3,4,5,6]  6
    //[1,2,6]
//    public ListNode removeElements(ListNode head, int val) {
//        ListNode cur = head;
//        while(cur != null && cur.next != null){
//            if(cur.next.val == val){
//                cur.next = cur.next.next;
//            }else{
//                cur = cur.next;
//            }
//        }
//        return head;
//    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel, curr = head;
        while (curr != null) {
            if (curr.val == val) prev.next = curr.next;
            else prev = curr;
            curr = curr.next;
        }
        return sentinel.next;
    }

}
