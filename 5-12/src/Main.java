/**
 * @date: 2021-5-13, 20:19
 * @author: ShiShc
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {this.val = val;}
}


public class Main {
    public ListNode f(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode cur = head.next, pre = head;
        while(cur != null) {
            if(pre.val == cur.val) {
                cur = cur.next;
                pre.next = cur;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }

        return head;
    }
}
