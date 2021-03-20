/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/20, 11:12
 * @Auther:ShiShc
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class getKthFromEnd {

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode ptr1 = head, ptr2 = head;
        for(int i = 0;i < k; ++i) {
            ptr1 = ptr1.next;
        }

        while(ptr1 != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr2;
    }


    public static void main(String[] args) {

    }
}
