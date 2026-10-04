package linkedlist;
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;

    public ListNode() {}
    public ListNode(int data) {
        this.data = data;
    }
    public ListNode(int data, ListNode prev, ListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
public class Delete_kth_element_of_DLL {
    
    public ListNode deleteKthElement(ListNode head, int k) {
        if (head == null || k <= 0) return head;
        if (k == 1) {
            head = head.next;
            if (head != null) head.prev = null;
            return head;
        }
        ListNode curr = head;
        int count = 1;

        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        if (curr != null) {
            if (curr.prev != null) curr.prev.next = curr.next;
            if (curr.next != null) curr.next.prev = curr.prev;
        }
        return head;
    }
}
