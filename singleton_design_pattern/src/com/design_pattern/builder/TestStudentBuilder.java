package com.design_pattern.builder;

public class TestStudentBuilder {

	
	public static void main(String[] args) {
		
		Student std=new Student.StudentBuilder("Ram", 10)
				.address("Pune")
				.mobNo(89007)
				.build();
		System.out.println(std);
	}
}
