/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/1/18, 19:30
 * @Auther:ShiShc
 * 2. 两数相加
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int num1 = l1 != null? l1.val : 0;
            int num2 = l2 != null? l2.val : 0;
            int sum = num1 + num2 + carry;

            if(head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }

            carry = sum / 10;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }

        if(carry > 0) {
            tail.next = new ListNode(carry);
        }

        return head;
    }
}
