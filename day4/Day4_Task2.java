package datastructure;

public class Day4_Task2 {
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
	public Day4_Task2() {
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
	
	public void insertatmid(int val) {
		        Node newNode = new Node(val);

		        if (head == null) {
		            head = newNode;
		            return;
		        }

		        Node slow = head;
		        Node fast = head;

		        while (fast != null && fast.next != null) {
		            slow = slow.next;
		            fast = fast.next.next;
		        }

		        Node prevNode = slow.prev;

		        newNode.next = slow;
		        newNode.prev = prevNode;
		        slow.prev = newNode;

		        if (prevNode != null) {
		            prevNode.next = newNode;
		        } else {
		           head = newNode;
		        }
		    }
	public static void main(String []args) {
		Day4_Task2 dl = new Day4_Task2();
		System.out.println("Doubly Linked List");
		dl.insert(5);
		dl.insert(8);
		dl.insert(2);
		dl.insert(9);
		dl.insert(4);
		System.out.println("Before insertion");
		dl.display();
		dl.insertatmid(6);
		System.out.println("\nAfter insertion");
		dl.display();
	}
}
