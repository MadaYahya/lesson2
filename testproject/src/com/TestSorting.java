package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSorting {
	public static void main(String[] args) {
 		List<Customer> list = new ArrayList<Customer>();
 		Customer customer1 = new Customer(2, "Bruce");
 		Customer customer2 = new Customer(1, "Alex");
 		Customer customer3 = new Customer(4, "David");
 		Customer customer4 = new Customer(3, "Charles");
 		Customer customer5 = new Customer(5, "Edward");
 		list.add(customer1);
 		list.add(customer2);
 		list.add(customer3);
 		list.add(customer4);
 		list.add(customer5);
 		for(Customer c : list) 
 			System.out.println(c);
 		Collections.sort(list);
 		System.out.println("-----------");
 		for(Customer c : list) 
 			System.out.println(c);
 	}
 }

