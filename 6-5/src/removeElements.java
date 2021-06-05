/**
 * @author: ShiShc
 * @desc:
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val, ListNode next) {
        this.next = next;
        this.val = val;
    }
}

public class removeElements {
    public ListNode f(ListNode head, int val) {
        ListNode first = new ListNode();
        first.next = head;

        ListNode pre = first, cur = head;
        while(cur != null) {
            if( cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }

        return first.next;
    }
}
