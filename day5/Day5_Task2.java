package datastructure;

public class Day5_Task2 {
	Node last;
	class Node{
		int data;
		Node next;
				
		Node(int var){
			data=var;
		}
	}
	
	public void display() {
		Node temp=last.next;
		do {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp!=last.next);
		System.out.println();
	}
	
	public void insert(int var) {
		Node x=new Node(var);
		if(last==null) {
			last=x;
			last.next=last;
		}
		else {
			x.next=last.next;
			last.next=x;
		}
	}
	
	public void tail(int var) {
		Node x=new Node(var);
		if(last==null) {
			last=x;
			last.next=last;
		}
		else {
			
			x.next=last.next;
			last.next=x;
			last=x;
		}
	}
	public static void main(String []args) {
		Day5_Task2 cll = new Day5_Task2();
		System.out.println("Circular Linked List");
		cll.tail(1);
		cll.tail(7);
		cll.insert(5);
		cll.insert(8);
		cll.insert(2);
		cll.tail(6);
		cll.insert(3);
		cll.display();
	}

}
