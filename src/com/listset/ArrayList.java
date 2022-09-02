package com.listset;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayList {
	
	public static void main(String[] args) {
		
		int a[]=new int[7];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=10;
		a[4]=50;
		a[5]=60;
		a[6]=20;
		
		System.out.println(a[2]);
		int length = a.length;
		System.out.println(length);
		
		System.out.println("******iteration using for loop****");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		 
		System.out.println("******iteration using enhanceed for loop****");

		for (int x : a) {
			System.out.println(x);
			
		}
		
		System.out.println("********array to list*****");
		
	    List<Integer> li=new LinkedList<>();
		
		for (int i = 0; i < a.length; i++) {
			 li.add(a[i]);
		
		}
		System.out.println(li);
		
		
		System.out.println("*******list to set*****");
		
		Set<Integer> s=new  LinkedHashSet<>();
		
		for (int j = 0; j < a.length; j++) {
			
			s.addAll(li);
			
		}
		System.out.println(s);
		
		
		
		
		System.out.println("********set to map************");
		
		Map<Object, Object> m= new LinkedHashMap<>();
		
		
		for (int i = 0; i < a.length; i++) {
			m.put(s,null);
			
		}
	
		Set<Object> keySet = m.keySet();
		System.out.println(keySet);
		
		
		
	}

}
