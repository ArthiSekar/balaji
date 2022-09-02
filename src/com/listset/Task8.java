package com.listset;

import java.util.LinkedList;
import java.util.List;

public class Task8 {
	
	
public static void main(String[] args) {
		
		List<Integer> li=new LinkedList<>();
		
		li.add(20);
		li.add(40);
		li.add(60);
		li.add(80);
		li.add(100);
		li.add(120);
		li.add(140);
		
		System.out.println("List is:"+li);
		
		//get the first 5 values from list
		for(int i=0;i<5; i++) {
			System.out.println(li.get(i));
		}
}
}
