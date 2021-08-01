package com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort1 {

	class Sort1 implements Comparator<Customer> {

	 	@Override
	 	
	 	public int compare(Customer o1, Customer o2) {
	 		return o1.getId() - o2.getId();
	 	}

	 }
	 class Sort2 implements Comparator<Customer> {

	 	@Override
	 	public int compare(Customer o1, Customer o2) {
	 		return o2.getId() - o1.getId();
	 	}

	 }
	 
	 class Sort3 implements Comparator<Customer> {

	 	@Override
	 	public int compare(Customer o1, Customer o2) {
	 		return o1.getName().compareTo(o2.getName());
	 	}

	 }
	 class Sort4 implements Comparator<Customer> {

	 	@Override
	 	public int compare(Customer o1, Customer o2) {
	 		return o2.getName().compareTo(o1.getName());
	 	}

	 }
	 
	 public class TestSortingComparator {
	 	public static void main(String[] args) {
	 		List<Customer> list = new ArrayList<Customer>();
	 		Customer customer1 = new Customer(8, "Bruce");
	 		Customer customer2 = new Customer(6, "Alex");
	 		Customer customer3 = new Customer(1, "David");
	 		Customer customer4 = new Customer(9, "Charles");
	 		Customer customer5 = new Customer(5, "Edward");
	 		list.add(customer1);
	 		list.add(customer2);
	 		list.add(customer3);
	 		list.add(customer4);
	 		list.add(customer5);
	 		for(Customer c : list) 
	 			System.out.println(c);
	 		Collections.sort(list, new Sort4()); // this calls compare() method of Comparator
	 		System.out.println("--------------------");
	 		for(Customer c : list) 
	 			System.out.println(c);
	 	}
	 }

	
	



