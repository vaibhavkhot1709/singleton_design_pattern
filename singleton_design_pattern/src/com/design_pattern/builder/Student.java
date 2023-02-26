package com.design_pattern.builder;

public class Student {

	String name;
	String address;
	int roll;
	long mobNo;
	
	
	public Student(StudentBuilder std) {
		this.name=std.name;
		this.address=std.address;
		this.roll=std.roll;
		this.mobNo=std.mobNo;
	}

	public static class StudentBuilder {

		String name;
		String address;
		int roll;
		long mobNo;

		public StudentBuilder(String name, int roll) {
			super();
			this.name = name;
			this.roll = roll;
		}

		public StudentBuilder address(String address) {
			this.address = address;
			return this;
		}

		public StudentBuilder mobNo(long mobNo) {
			this.mobNo = mobNo;
			return this;
		}

//		@Override
//		public String toString() {
//			return "StudentBuilder [name=" + name + ", address=" + address + ", roll=" + roll + ", mobNo=" + mobNo
//					+ "]";
//		}

		
		public Student build(){
			return new Student(this);
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", roll=" + roll + ", mobNo=" + mobNo + "]";
	}
	
	

}
