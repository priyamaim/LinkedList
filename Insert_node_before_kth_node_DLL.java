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
public class Insert_node_before_kth_node_DLL {

    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {
        if(head==null && K==1)return new ListNode(X);
        ListNode ptr =head;
        int count=1;
        while(ptr!=null && count<K){
            ptr=ptr.next;
            count++;
        }
        ListNode newnode = new ListNode(X);
        if(ptr!=null){
        newnode.next=ptr;
        newnode.prev=ptr.prev;
        if(ptr.prev!=null)ptr.prev.next=newnode;
        else
        head=newnode;}
        ptr.prev=newnode;
        return head;
    }
}
    
