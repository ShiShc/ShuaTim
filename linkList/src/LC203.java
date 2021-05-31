class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}
/**
 * @author: ShiShc
 * @desc:
 */
public class LC203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode first = new ListNode();
        first.next = head;

        ListNode pre = first, cur = first.next;
        while(cur != null) {
            if(cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }

        return first.next;
    }
}
