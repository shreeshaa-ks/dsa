package datastructure;

import java.util.Scanner;

public class Day3_Task5 {
	static class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }

    static Node head = null;

    public static void insert(int val) {
        Node x = new Node(val);
        if (head == null) {
            head = x;
        }
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            	temp.next = x;
        }
    }

    public static void delete(int pos) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i=0; i<pos-1 && temp!=null;i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid position.");
            return;
        }
        temp.next = temp.next.next;
    }

    public static void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value, pos;

        do {
            System.out.println("\n1. Insert");
            System.out.println("2. Delete at position");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    insert(value);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();
                    delete(pos);
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        sc.close();
    }

}
