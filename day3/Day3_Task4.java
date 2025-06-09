package datastructure;

import java.util.Scanner;

public class Day3_Task4 {
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
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = x;
        }
    }

    public static void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        System.out.println("Original list:");
        display();
        reverse();
        System.out.println("Reversed list:");
        display();
    }

}
