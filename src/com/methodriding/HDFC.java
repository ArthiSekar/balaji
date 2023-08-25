package com.methodriding;

public class HDFC extends ICICI {
	@Override
	public void branchName() {
		System.out.println("HDFC Branch name is: Velachery");
		super.branchName();
	}
	@Override
	public void phone() {
		System.out.println("HDFC Branch phone no is: 9876123456");
		super.phone();
	}
	public static void main(String[] args) {
		ICICI h=new HDFC();
		h.name();
		h.email();
		h.branchName();
		h.phone();
	}
}
