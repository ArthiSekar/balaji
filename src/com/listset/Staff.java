package com.listset;

public class Staff extends Student {
  

public  Staff() {	

		System.out.println("*****STAFF DETAILS**********");
	}
	
	public  Staff (String name) {
		super();
		System.out.println("Staff name is:"+name);
	}
	
	public Staff (String email ,long mobile) {
		super("Sekar");
		System.out.println("Staff email id is:"+email+"Student mobile is"+mobile);
	}
	
	public Staff (char gender) {
		super("sekar@gmail.com",9876547610l);
		System.out.println("Staff Gender is:"+gender);
	}
	
	public Staff (String address,int id) {
		super('M');
		System.out.println("Staff Address is:"+address+"Student id is:"+id);
	}
	
	public Staff (int age) {
		super("Chennai",9765);
		System.out.println("Staff age is:"+age);
	}
	
	public Staff (int year,int month) {
		super(25);
		System.out.println("Staff joining year is:"+year+month);
	}
	
	public static void main(String[] args) {
		Student s1= new Student(2015,07);
		Staff s=new Staff(2015,7);
	
		
		
	}

	}




