package JzOffer.listNode;

public class DeleteDuplicates {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    /* 输入：1 -> 1 -> 2
       输出：1 -> 2
       (排序后的连表)
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val ){
                cur.next = cur.next.next;//删除操作
            }else{
                cur = cur.next;
            }
        }
        return head;
    }


}
