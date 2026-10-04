package linkedlist;

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