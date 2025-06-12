package datastructure;

import java.util.Scanner;

public class Day6_Task2 {
	int top=-1;
	int stack[]=new int[4];
	public void push(int x) {
		if(top<stack.length-1) {
			++top;
			stack[top]=x;
		}
		else {
			System.out.println("Stack Overflow");
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
		}
		else {
			System.out.println("Poped value:"+stack[top]);
			top--;
		}
	}
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.print(stack[i]+" ");
		}
	}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Stack Operation");
		Day6_Task2 st=new Day6_Task2();
		int choice;
		
		do {
			System.out.println("\n1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			choice=s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Push Operation");
			System.out.println("Enter the value:");
			int a=s.nextInt();
			st.push(a);
			break;
		case 2:
			System.out.println("Pop Operation");
			st.pop();
			break;
		case 3:
			System.out.println("Display");
			st.display();
			break;
		case 4:
			System.out.println("Exiting..");
		}

		}while(choice!=4);
		s.close();
	}

}
