package linkedlist;

public class Sort_SLL_of_0s_1s_2s {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode zeroDummy = new ListNode(-1);
        ListNode oneDummy  = new ListNode(-1);
        ListNode twoDummy  = new ListNode(-1);

        ListNode zero = zeroDummy;
        ListNode one  = oneDummy;
        ListNode two  = twoDummy;

        ListNode ptr = head;
        while (ptr != null) {
            if (ptr.data == 0) {
                zero.next = ptr;
                zero = zero.next;
            } else if (ptr.data == 1) {
                one.next = ptr;
                one = one.next;
            } else {
                two.next = ptr;
                two = two.next;
            }
            ptr = ptr.next;
        }
        
        zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
        one.next = twoDummy.next;
        two.next = null; 

        return zeroDummy.next;
    }
}
