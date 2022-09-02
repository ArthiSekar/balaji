package com.listset;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx {
	
	public static void main(String[] args) {
		
		Set<Integer> s=new LinkedHashSet<Integer>();
		
		s.add(20);
		s.add(40);
		s.add(60);
		s.add(80);
		s.add(100);
		s.add(20);
		s.add(60);
		
		System.out.println(s);
		
		int size = s.size();
		System.out.println(size);   //length of the set
		
		s.remove(80);
		System.out.println(s);   //remove the particular value
		
		boolean empty = s.isEmpty();
		System.out.println(empty); //check set is empty or not
		
		boolean contains = s.contains(20);
		System.out.println(contains);     //check the value is present or not
		
	
		System.out.println("********foreachloop*******");
		for (Object x : s) {
			System.out.println(x);
			
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
