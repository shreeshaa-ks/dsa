package datastructure;

public class Day3_Task1 {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int var){
			data=var;
			next=null;
		}
	}
	public Day3_Task1() {
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
	public static void main(String []args) {
		Day3_Task1 sl = new Day3_Task1();
		System.out.println("Singly Linked List");
		sl.insert(5);
		sl.insert(8);
		sl.insert(2);
		sl.display();
	}

}
