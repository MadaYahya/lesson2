package com;

import java.util.HashSet;
import java.util.Set;

public class TestHashPerformance {
	
	 	public static void main(String[] args) {
	 		Set<User> set = new HashSet<User>();
	 		for(int i = 1; i <= 50000; i++) {
	 			User user = new User(i);
	 			set.add(user);
	 			System.out.println("added user no: "+i);
	 		}
	 		System.out.println("--- done!---");
	 	}
	 
	}

