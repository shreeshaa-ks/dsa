package datastructure;

public class Day6_Task3 {
	int num[]=new int[5];
	int count=0;

	public void enqueue(int n) {
		if(count==num.length) {
			System.out.println("Queue is full");
			return;
		}
		else{
			num[count]=n;
			count++;
		}}

		public void dequeue() {
			if(count==0) {
				System.out.println("Queue is empty");
				return;
			}
			else{
				for(int i=1;i<count;i++) {
					num[i-1]=num[i];
				}
				count--;
			}
			
		}

		public void display() {
			for(int i=0;i<count;i++) {
			System.out.print(num[i]+" ");
		}
		}

		public static void main(String args[]) {
			Day6_Task3 t=new Day6_Task3();
			t.enqueue(22);
			t.enqueue(44);
			t.enqueue(60);
			t.enqueue(48);
			System.out.println("Enqueue the value");
			t.display();
			t.dequeue();
			System.out.println("\nDequeue the value");
			t.display();
		}
}
