package datastructure;

public class Day4_Task4 {
	Node head;
	Node tail;
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
	
	public Day4_Task4() {
		head=null;
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
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public void reverse() {
	    if (head == null) 
	    	return;
	    Node temp = head;
	    while (temp.next != null) {
	        temp = temp.next;
	    }
	    while (temp != null) {
	        System.out.print(temp.data + " ");
	        temp = temp.prev;
	    }
	}
	
	public  static void main(String[]args) {
		Day4_Task4 dl=new Day4_Task4();
		dl.insert(8);
		dl.insert(3);
		dl.insert(7);
		System.out.println("Insertion");
		dl.display();
		System.out.println("\nReverse");
		dl.reverse();
		
		
	}

}
