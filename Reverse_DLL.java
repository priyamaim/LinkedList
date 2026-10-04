package linkedlist;

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