package LinkedList;
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
public class Reverse_DLL {

    public ListNode reverseDLL(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode ptr = head;
        while(ptr.next!=null){
            ListNode temp=ptr.next;
            ptr.next=ptr.prev;
            ptr.prev=temp;
            ptr=ptr.prev;
        }
        ListNode temp=ptr.next;
        ptr.next=ptr.prev;
        ptr.prev=temp;
        head=ptr;
        return head;
    }
}