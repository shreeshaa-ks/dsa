package datastructure;

import java.util.Scanner;

public class Day5_Task4 {
	Node last;
	class Node{
		int data;
		Node next;
		Node(int var){
			data=var;
		}
	}
	public void insert(int m) {
		Node x=new Node(m);
		if(last==null) {
			last=x;
			last.next=last;
		}
		else {
			x.next=last.next;
			last.next=x;
		}
	}
	public void delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position:");
		int pos=sc.nextInt();
		if (last==null) {
			System.out.println("List is empty");
			return;
		}
		else if(pos==0) {
			last=last.next;
			return;
		}
		Node temp=last;
		for(int i=0;i<pos-1 && temp!=null;i++) {

			temp=temp.next;

			if(temp==null||temp.next==null)

			{

				System.out.println("Invalid position");

			}
		}
		temp.next=temp.next.next;
	}
	public void display() {
		Node temp=last.next;
		do {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp!=last.next);
	}
	public static void main(String[]args) {
		Day5_Task4 cll=new Day5_Task4();
		System.out.println("Circular Linked List");
		cll.insert(30);
		cll.insert(60);
		cll.insert(90);
		cll.display();
		System.out.println("\nAfter removing the value");
		cll.delete();
		cll.display();
		
		
	}

}
