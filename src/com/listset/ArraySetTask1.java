package com.listset;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArraySetTask1 {
	
	public static void main(String[] args) {
		
		int a[] []=new int[2][3];
		
		a[0] [0]=20;
		a[0][1]=30;
		a[0][2]=40;
		a[1][0]=60;
		a[1][1]=20;
		a[1][2]=30;
		
		System.out.println("****Array*****");
		for(int[] x:a) {
			for(int y:x) {
				System.out.println(y);		
			}
		}
		
		
	Set<Integer> s=new LinkedHashSet<>();
	
	
	//Integer c=s.addAll(a);
//	System.out.println(c);
	
	

		
		
		
		
	
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
