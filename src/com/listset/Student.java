package com.listset;

public class Student  {
	
	public Student() {
		System.out.println("*****STUDENT DETAILS**********");
		
	}
	
	public Student(String name) {
	//	this();
		System.out.println("Student name is:"+name);
	}
	
	public Student(String email ,long mobile) {
    //	this("S.Arthi");
		System.out.println("Student email id is:"+email+"Student mobile is"+mobile);
	}
	
	public Student(char gender) {
//		this("arthi@gmail.com",9876543210l);
		System.out.println("Student Gender is:"+gender);
	}
	
	public Student(String address,int id) {
	//	this('F');
		System.out.println("Student Address is:"+address+"Student id is:"+id);
	}
	
	public Student(int age) {
	//	this("Chidamabaram",98765);
		System.out.println("Student age is:"+age);
	}
	
	public Student(int year,long month) {
	//	this(22);
		System.out.println("Student joining year is:"+year+month);
	}

	public static void main(String[] args) {
}
}