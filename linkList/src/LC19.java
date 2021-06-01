/**
 * @author: ShiShc
 * @desc:
 */
public class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front = new ListNode();
        front.next = head;

        ListNode pre = front, cur = head, next= head;
        while(n > 1) {
            next = next.next;
            n --;
        }

        while(next.next != null) {
            pre = pre.next;
            cur = cur.next;
            next = next.next;
        }

        pre.next = cur.next;

        return front.next;
    }

    public static void main(String[] args) {
        ListNode node = new LC19().removeNthFromEnd(new ListNode(1, null), 1);
        System.out.println(node.toString());
    }
}
