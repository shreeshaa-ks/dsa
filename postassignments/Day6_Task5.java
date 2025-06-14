package datastructure;

public class Day6_Task5 {
	class Node{
		int data;
		Node next;
		Node(int k){
			data=k;
			next=null;
		}
	}

		Node top;
		public Day6_Task5() {
			top=null;
		}

		public void push(int val) {
			Node x=new Node(val);
			x.next=top;
			top=x;
		}

		public void pop() {
			if(top==null) {
				System.out.println("Stack is Empty");
				return;
			}
			top=top.next;
		}

		public void peek() {
			if(top==null) {
				System.out.println("Stack is Empty");
			}
			else {
				System.out.println("\nTop value is "+top.data);
			}
		}

		public void show() {
			if(top==null) {
				System.out.println("Stack Empty");
				return;
			}
			else {
				Node temp=top;
				while(temp!=null) {
					System.out.print(temp.data+" ");
					temp=temp.next;
				}
			}		
		}

	public static void main(String[]args) {
		Day6_Task5 st=new Day6_Task5();
		System.out.println("Stack operations in Singly Linked List");
		st.push(20);
		st.push(90);
		st.push(22);
		st.push(45);
		System.out.println("Push...");
		st.show();;
		st.pop();
		st.pop();
		System.out.println("\nPop...");
		st.show();
		System.out.print("\nPeek...");
		st.peek();		
	}
}