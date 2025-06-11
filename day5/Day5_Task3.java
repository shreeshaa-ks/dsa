package datastructure;

public class Day5_Task3 {
	Node last;
	class Node{
		int data;
		Node next;
		Node(int val){
			data=val;
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
	
	public void display() {
		Node temp=last.next;
		do {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp!=last.next);
	}
	
	public void delete() {
		Node head=last.next;
		if(last==head) {
			last=null;
		}
		else {
			last.next=head.next;
		}
	}
	public static void main(String[]args) {
		Day5_Task3 cll=new Day5_Task3();
		System.out.println("Circular Linked List");
		cll.insert(3);
		cll.insert(1);
		cll.insert(8);
		cll.display();
		cll.delete();
		System.out.println("\nAfter removing head:");
		cll.display();
	}

}
