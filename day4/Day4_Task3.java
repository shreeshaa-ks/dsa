package datastructure;

public class Day4_Task3 {
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
	public Day4_Task3() {
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
	

	
	public void delete() {
		 if (head == null) {
		        System.out.println("List is empty, nothing to delete.");
		        return;
		    }
		 Node slow = head;
		    Node fast = head;

		    while (fast != null && fast.next != null) {
		        slow = slow.next;
		        fast = fast.next.next;
		    }
		    
		Node prevNode = slow.prev;
	    Node nextNode = slow.next;

	    if (prevNode == null) {
	        head = nextNode;
	        if (head != null) {
	            head.prev = null;
	        }
	    } else {
	        prevNode.next = nextNode;
	        if (nextNode != null) {
	            nextNode.prev = prevNode;
	        }
	    }

	
	    slow.next = null;
	    slow.prev = null;

	    System.out.println("\nDeleted middle node with value: " + slow.data);
	}

	
	public static void main(String []args) {
		Day4_Task3 dl = new Day4_Task3();
		System.out.println("Doubly Linked List");
		dl.insert(5);
		dl.insert(8);
		dl.insert(2);
		dl.insert(9);
		dl.insert(4);
		System.out.println("Before deletion");
		dl.display();
		dl.delete();
		System.out.println("After deletion");
		dl.display();
	}

}
