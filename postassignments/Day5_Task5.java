package datastructure;

import java.util.Scanner;

public class Day5_Task5 {
	Node last;
	class Node{
		int data;
		Node next;
		Node(int var){
			data=var;
		}
	}
	public void insert(int val) {
		Node x=new Node(val);
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
			
		}
		else if(pos==0) {
			last=last.next;
			
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
		sc.close();
	}
	public void display() {
		Node temp=last.next;
		do {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp!=last.next);
	}
	public static void main(String[]args) {
		Day5_Task5 cll=new Day5_Task5();
		System.out.println("Circular Linked List");
		Scanner s = new Scanner(System.in);
	    int choice;
	    do {
	        System.out.println("\n1. Insert");
	        System.out.println("2. Delete at position");
	        System.out.println("3. Display");
	        System.out.println("4. Exit");
	        System.out.print("Enter choice: ");
	        choice = s.nextInt();

	        switch (choice) {
	            case 1:
	            	System.out.println("Enter a number:");
	                cll.insert(s.nextInt());
	                break;
	            case 2:
	                cll.delete();
	                break;
	            case 3:
	                cll.display();
	                break;
	            case 4:
	                System.out.println("Exiting...");
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }
	    } while (choice != 4);
	    s.close();
	}

}
