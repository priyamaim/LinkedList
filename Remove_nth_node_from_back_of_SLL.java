package linkedlist;

public class Remove_nth_node_from_back_of_SLL {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n > size || n <= 0) return head;
        if (n == size) return head.next;

        ListNode ptr = head;
        for (int i = 1; i < size - n; i++) {
            ptr = ptr.next;
        }

        ptr.next = ptr.next.next;

        return head;
    }
}
