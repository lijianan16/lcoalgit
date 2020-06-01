package fanzhuanlianbiao;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
class sloution{
    public ListNode reverseList(ListNode head) {
            ListNode pre = null;
            ListNode cur = head;
            while (cur!=null){
                ListNode nexttemp = cur.next;
                cur.next=pre;
                pre = cur;
                cur = nexttemp;
            }
            return pre;
    }
}
