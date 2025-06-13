package datastructure;

public class Day6_Task4 {
	int queue[]=new int [5];
	int size,front,rear;
	public void enqueue(int val) {
		if(rear==queue.length) {
			System.out.println("Queue is full");
			return;
		}
		else{
		queue[rear]=val;
		rear++;
		size++;
		}
	}

	public int dequeue() {
		int data=queue[front];
		front++;
		size--;
		System.out.println("\nValues dequeued is "+data);
		return data;
	}

	public void show() {
		for(int i=0;i<size;i++) {
			System.out.print(queue[front+i]+" ");
		}
	}

	public static void main(String[]args) {
		Day6_Task4 q=new Day6_Task4();
		q.enqueue(5);
		q.enqueue(3);
		q.enqueue(15);
		q.enqueue(31);	
		System.out.println("Enqueue the elements");
		q.show();
		q.dequeue();
		q.dequeue();
		System.out.println("Dequeue the elements");
		q.show();
	}
}
