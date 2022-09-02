package com.listset;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArraySet {
	public static void main(String[] args) {
		
	
	
	int a[]=new int[7];
	
	a[0]=20;
	a[1]=40;
	a[2]=60;
	a[3]=20;
	a[4]=80;
	a[5]=100;
	a[6]=60;
	
	for(int x:a) {
	System.out.println(x);
	}
	
	Set<Integer> x=new LinkedHashSet<Integer>();	
	for (int i =0; i < 7; i++) {
		System.out.println(a);
		
	}
	
	
	//List<Integer> li=new ArrayList<Integer>();
	//li. addAll(x);
	

	
	//li.addAll(a);
	//System.out.println(li;)

}}
