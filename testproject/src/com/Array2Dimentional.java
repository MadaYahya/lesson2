package com;

public class Array2Dimentional {
	
	public static void main(String[] args) {
		
 		int[][] array2D = {{1, 2, 3, 4}, {8, 7, 6}, {10, 20, 30, 40, 50}};


 		for(int i = 0; i < array2D.length; i++) {
 			for(int j = 0; j < array2D[i].length; j++) {
 				System.out.print(array2D[i][j]+ " ");
 			}
 			System.out.println();
 		}

 	}
}

