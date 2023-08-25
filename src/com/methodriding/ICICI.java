package com.methodriding;

public class ICICI extends Sbi{
	@Override
	public void branchName() {
		System.out.println("ICICI  Branch name is: S.P.Koil");
		super.branchName();
	}
	@Override
	public void phone() {
		System.out.println("ICICI Branch phone no is:7654328765");
		super.phone();
	}

}
