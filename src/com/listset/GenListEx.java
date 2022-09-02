package com.listset;

import java.util.LinkedList;
import java.util.List;

public class GenListEx {
	
	public static void main(String[] args) {
		
		List<Integer> li=new LinkedList<>();
		
		li.add(243);
		li.add(433);
		li.add(4787);
		li.add(6799);
		li.add(243);
		li.add(878);
		li.add(4787);
		li.add(500);
		
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
		
		Integer integer = li.get(7);
		System.out.println(integer);
		
		li.remove(3);
		System.out.println(li);
		
		li.add(300);
		System.out.println(li);
		
		li.add(4,400);
		System.out.println(li);
		
		int indexOf = li.indexOf(243);
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(243);
		System.out.println(lastIndexOf);
		
		int indexOf2 = li.indexOf(465787);
		System.out.println(indexOf2);
		
		int indexOf3 = li.indexOf(500);
		System.out.println(indexOf3);
		
		boolean empty = li.isEmpty();
		System.out.println(empty);
		
		boolean contains = li.contains(878);
		System.out.println(contains);
		
		System.out.println("*********forloop************");
		for (int i = 0; i < li.size(); i++) {
			
			System.out.println(li.get(i));
			
		}
		
		
		System.out.println("******enhanced for loop****");
		
		for (Integer y : li) {
			System.out.println(y);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
