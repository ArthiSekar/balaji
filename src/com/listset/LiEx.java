package com.listset;

import java.util.LinkedList;
import java.util.List;

public class LiEx {

	public static void main(String[] args) {
		
		List<Object> li=new LinkedList<>();
		
		li.add("Arthi");
		li.add(30);
		li.add('F');
		li.add(9087654321l);
		li.add(45.657f);
		li.add(766444678.97754668d);
		li.add(true);
		li.add(70);
		
		System.out.println(li);
		
		
		
		int size = li.size();        //length
		System.out.println(size);
		
		Object object = li.get(4);
		System.out.println(object);   //get the particular value
		
		li.remove(1);
		System.out.println(li);         //remove particular value
		
		li.add(23);
		System.out.println(li);        //add the new value at the end
		
		li.add(3,200);
		System.out.println(li);        //add the value for particular index value
		
		li.set(5,'M');
		System.out.println(li);        //replace the value
		
		boolean contains = li.contains(70);
		System.out.println(contains);     //particular value present or not
		
		li.add(200);
		System.out.println(li);
		
		int indexOf = li.indexOf(200);
		System.out.println(indexOf);           //first index value of 200
		
		int lastIndexOf = li.lastIndexOf(200);
		System.out.println(lastIndexOf);         //last index value 200
		
		
		int indexOf2 = li.indexOf(34);
		System.out.println(indexOf2);
		 
		boolean empty = li.isEmpty();
		System.out.println(empty);       //list is empty r not
		
		
		
		System.out.println("******forloop******");
		for (int i = 0; i < li.size(); i=i+2) {
			
			System.out.println(li.get(i)); //for alternate number
			
		}
		
		System.out.println("******foreachloop******");
	
		for (Object x : li) {
			
			System.out.println(x);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
