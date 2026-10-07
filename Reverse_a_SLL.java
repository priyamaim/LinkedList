package LinkedList;

public class Reverse_a_SLL {
    public ListNode reverseList(ListNode head) {
           ListNode prev=null;
           ListNode curr=head;
           while(curr!=null){
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }
}

