package com;

public class TestObjectClass {
	public static void main(String[] args) {
 		String s1 = new String("Hello");
 		String s2 = new String("Hello");
 		System.out.println(s1+" "+s2); // toString()
 		StringBuffer sb1 = new StringBuffer("welcome");
 		StringBuffer sb2 = new StringBuffer("welcome");
 		System.out.println(sb1 + " "+sb2); // toString()
 		Employee e = new Employee(100, "Alex");
 		Employee e2 = new Employee(100, "Alex");
 		System.out.println(e); //toString()
 		// calling equals in String & StringBuffer
 		System.out.println("string comparison: " +s1.equals(s2)); // true
 		System.out.println("string buffer comparison: "+sb1.equals(sb2)); // false
 		System.out.println("employee comparison: "+e.equals(e2));
 		System.out.println("hashcode of e: "+e.hashCode());
 		System.out.println("hashCode of e2: "+e2.hashCode());
 		System.out.println("hashCode of s1: "+s1.hashCode());
 		System.out.println("hashCode of s2: "+s2.hashCode());
 	}
 }

