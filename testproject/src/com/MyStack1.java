package com;

class MyStack1 {
	int[] stack;
 	int top;
 	MyStack1 (int size) {
 		stack = new int[size];
 		top = -1;
 	}
 	void push(int item) {
 		if(top == (stack.length - 1))
 			System.out.println("Stack is full!!!");
 		else {
 			stack[++top] = item;
 			System.out.println(item +" added at "+top);
 		}
 	}
 	int pop() {
 		if(top != -1) {
 			System.out.println(stack[top]+" is popped!");
 			return stack[top--];
 		} else {
 			System.out.println("Stack is already empty!");
 			return top;
 		}
 	}
 	void display() {
 		if(top == -1) 
 			System.out.println("Stack is empty!");
 		else {
 			for(int i = 0; i <= top; i++) 
 				System.out.println(stack[i]+" is present at "+i);
 		}
 	}
 }

 public class MyStackDemo {
 	public static void main(String[] args) {
 		MyStack myStack = new MyStack(5);
 		myStack.display();
 		for(int i = 1; i < 10; i++) myStack.push(i * 10);
 		myStack.display();
 		for(int i = 1; i < 10; i++) myStack.pop();
 	}
 }

