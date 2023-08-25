package com.methodriding;

public class Sbi extends MyDetail {

	public void branchName() {
		System.out.println("SBI Branch name is: Tambaram");
	}
	@Override
	public void phone() {
		System.out.println("SBI Branch phone number is: 9876545678");
		super.phone();
	}
}
