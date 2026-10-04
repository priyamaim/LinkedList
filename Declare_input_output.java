package linkedlist;

import java.util.Scanner;

class Node {
    int data;      // value stored
    Node next;     // pointer to next node

    Node(int data1) {
        data = data1;
        next = null;
    }
}


public class Declare_input_output {
    // Function to create linked list from user input
    public static Node createLinkedList(int n, Scanner sc) {
        if (n <= 0) return null;

        // First node
        int val = sc.nextInt();
        Node head = new Node(val);
        Node temp = head;

        // Remaining nodes
        for (int i = 1; i < n; i++) {
            val = sc.nextInt();
            temp.next = new Node(val);
            temp = temp.next;
        }
        return head;
    }

    // Function to print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " values:");
        Node head = createLinkedList(n, sc);

        System.out.println("Linked List:");
        printList(head);
    }
}

