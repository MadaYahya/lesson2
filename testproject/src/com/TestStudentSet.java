package com;


import java.util.HashSet;
import java.util.Set;

public class TestStudentSet {

	public static void main(String[] args) {
 		Student s1 = new Student(300, "Charles"); // 1500906121
 		Student s2 = new Student(100, "Alex"); // 63348135
 		Student s3 = new Student(400, "David"); // 2039984509
 		Student s4 = new Student(200, "Bruce"); // 1998390338
 		Student s5 = new Student(400, "David"); // 2039984509

 		Set<Student> set = new HashSet<Student>();
 		set.add(s1);
 		set.add(s2);
 		set.add(s3);
 		set.add(s4);
 		set.add(s5);
 		for(Student student : set) {
 			System.out.println(student);
 		}

 	}
	
	
}
