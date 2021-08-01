package project;

class MyQueque {
	int[] queue;
	int front;
	int rear;
	MyQueue(int size){
		queue= new int[size];
		front= -1;
		rear= -1;
	}
	void add(int item) {
		if(rear==(queue.length -1))
			System.out.println("Queue is Full!!");
		else {
			queue[++rear]= item;
			System.out.println(item+ " is added to the queue at "+ rear);
		}		
	}
}
public class MyQuequeDemo {
	public static void main(String[] args) {
	
}
}