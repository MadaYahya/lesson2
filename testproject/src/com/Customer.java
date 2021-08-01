package com;

public class Customer implements Comparable<Customer> {
	
	private int id;
 	private String name;
 	public Customer(int id, String name) {
 		super();
 		this.id = id;
 		this.name = name;
 	}
 	public Customer() {
 		super();
 	}
 	@Override
 	public String toString() {
 		return "Customer [id=" + id + ", name=" + name + "]";
 	}
 	public int getId() {
 		return id;
 	}
 	public void setId(int id) {
 		this.id = id;
 	}
 	public String getName() {
 		return name;
 	}
 	public void setName(String name) {
 		this.name = name;
 	}
 	@Override
 	public int compareTo(Customer o) {
 		return this.id - o.getId();
 	}

 }
	
	


