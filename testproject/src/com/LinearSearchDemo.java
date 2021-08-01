package com;

import java.util.Scanner;

public class LinearSearchDemo {
	

	 	public static void main(String[] args) {
	 		int[] items = {10, 30, 20, 50, 40};
	 		Scanner sc = new Scanner(System.in);
	 		System.out.println("Enter the element you want to search");
	 		int element = sc.nextInt();
	 		int index = search(items, element);
	 		if(index != -1) {
	 			System.out.println(element+" is found at the position: "+index);
	 		} else {
	 			System.err.println(element+" is not found!");
	 		}
	 	}
	 	//return the index / position of the item or -1
	 	public static int search(int[] array, int key) {
	 		for(int i = 0; i < array.length; i++) {
	 			if(array[i] == key)
	 				return i;
	 		}
	 		return -1;
	 	}
	

}
