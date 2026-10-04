package linkedlist;

// Node class
class Node {
    int data;
    Node next;

    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class insert_at_beginning {

    public static Node insertAtHead(Node head, int X) {
        Node newNode = new Node(X);   // Step 1: create new node
        newNode.next = head;          // Step 2: link new node to old head
        head = newNode;               // Step 3: update head
        return head;                  // return new head
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create initial linked list: 2 -> 5 -> 8 -> 7
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(7);

        System.out.println("Original List:");
        printList(head);

        // Insert X = 10 at head
        head = insertAtHead(head, 10);

        System.out.println("After inserting 10 at head:");
        printList(head);
    }
}

