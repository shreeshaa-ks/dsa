package datastructure;

public class Day4_Task1 {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int var){
			data=var;
			next=null;
			prev=null;
		}
	}
	public Day4_Task1() {
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
			x.next=head;
			head.prev=x;
			head=x;
		}
	}
	public static void main(String []args) {
		Day4_Task1 dl = new Day4_Task1();
		System.out.println("Doubly Linked List");
		dl.insert(5);
		dl.insert(8);
		dl.insert(2);
		dl.display();
	}
}
