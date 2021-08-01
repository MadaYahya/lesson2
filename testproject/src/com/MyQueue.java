package com;

public class MyQueue {
	int[] queue;
 	int front;
 	int rear;
 	MyQueue (int size) {
 		queue = new int[size];
 		front = -1;
 		rear = -1;
 	}
 	void add(int item) {
 		if(rear == (queue.length - 1))
 			System.out.println("Queue is full!!");
 		else {
 			queue[++rear] = item;
 			System.out.println(item +" is added to the queue at "+rear);
 		}
 		if(front == -1) 
 			front++;
 	}
 	// FIFO
 	int poll() {
 		if(front == rear + 1) {
 			System.out.println("queue is empty!");
 			return rear;
 		} else {
 			System.out.println(queue[front]+" is removed");
 			return queue[front++];
 		}
 	}
 	int getFirst() {
 		return queue[front];
 	}
 	int getLast() {
 		return queue[rear];
 	}
 }

 public class MyQueueDemo {
 	public static void main(String[] args) {
 		MyQueue q = new MyQueue(5);
 		for(int i = 1; i <= 10; i++) 
 			q.add(i * 10);
 		System.out.println("First item: "+q.getFirst()+", Last item: "+q.getLast());
 		for(int i = 1; i <= 10; i++) 
 			q.poll();
 	}
}
