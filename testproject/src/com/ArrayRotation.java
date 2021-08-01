package com;

public class ArrayRotation {
	
	public static void main(String[] args) {
 		int[] array = {10, 20, 30, 40, 50};
 		rotate(array, 2);
 	}

 	public static void rotate(int[] array, int steps) {
 		
 		if(steps > array.length) 
 			
 			steps = steps % array.length;
 		int[] result = new int[array.length];
 		
 		// copy the rotated elements to the new array
 		for(int i = 0; i < steps; i++) {
 			
 			result[i] = array[array.length - steps + i];
 		}
 		// copying the remaining elements
 		int j = 0;
 		for(int i = steps; i < array.length; i++) {
 			result[i] = array[j];
 			j++;
 		}
 		System.out.println("--- old array elements ----");
 		for(int x : array) {
 			System.out.print(x+" ");
 		}
 		System.out.println();
 		System.out.println("--- new array elements ----");
 		for(int x : result) {
 			System.out.print(x+" ");
 		}
 		System.out.println();
 	}

 }

