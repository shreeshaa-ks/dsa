package datastructure;

import datastructure.Day3_Task1.Node;

public class Day3_Task2 {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int var){
			data=var;
			next=null;
		}
	}
	public Day3_Task2() {
		head=null;
	}

	public void insertAtanyPosition(int pos,int var) {
		Node m1 = new Node(var);
		if (pos == 0) {
            m1.next = head;
            head = m1;
            return;
        }

        Node current = head;
        int count = 0;

        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }
        
        if (current == null) {
            System.out.println("Position out of range");
            return;
        }
        m1.next = current.next;
        current.next = m1;

	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String []args) {
		Day3_Task2 sl=new Day3_Task2();
		System.out.println("Insert at any position");
		sl.insertAtanyPosition(0,50);
		sl.insertAtanyPosition(1,150);
		sl.insertAtanyPosition(2,250);
		sl.display();
	}

}
