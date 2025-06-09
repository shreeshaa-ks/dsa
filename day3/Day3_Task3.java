package datastructure;

import datastructure.Day3_Task1.Node;

public class Day3_Task3 {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int var){
			data=var;
			next=null;
		}
	}
	public Day3_Task3() {
		head=null;
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public void insert(int var) {
		Node x=new Node(var);
		if(head==null) {
			head=x;
		}
		else {
			Node temp=head;
			x.next=temp;
			head=x;
		}
	}
	
	public void delete(int pos) {
		if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of range.");
            return;
        }

        current.next = current.next.next;
	}
	
	public static void main(String[]args) {
		Day3_Task3 sl=new Day3_Task3();
		System.out.println("Deletion at any position");
		sl.insert(5);
		sl.insert(2);
		sl.insert(7);
		sl.insert(9);
		sl.delete(1);
		sl.display();
	}
	
}
