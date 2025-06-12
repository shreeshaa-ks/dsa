package datastructure;

public class Day6_Task1 {
	int m[]=new int[3];
	int top=-1;
	public void push(int var) {
		if(top<m.length-1) {
			++top;
			m[top]=var;
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
			System.out.println("Pop the value:"+m[top]);
			top--;
		}
	}
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(m[i]);
		}
	}
	public static void main(String[]args) {
		Day6_Task1 st=new Day6_Task1();
		System.out.println("Stack Operations");
		st.push(20);
		st.push(60);
		st.push(70);
		st.push(40);
		st.display();
		st.pop();
		st.display();
	}
}
