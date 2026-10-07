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
public class Insert_before_given_node_DLL {

    public void insertBeforeGivenNode(ListNode node, int X) {
        if(node==null)return;
        ListNode newnode= new ListNode(X);
        newnode.prev=node.prev;
        newnode.next=node;
         if(node.prev!=null){
            node.prev.next=newnode;
         }
         node.prev=newnode;
    }    
}