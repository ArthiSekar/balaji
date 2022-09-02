package com.listset;

import java.util.LinkedList;
import java.util.List;

public class Task10 {
	
	
	
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
		
		System.out.println("*******Get Middel values in list*******");
		
		int l=(li.size()/2);
		int b=l-1;
		
		//get the last 5 values in list
		for(int i=l;i>b; i--) {
					System.out.println(li.get(i));
				}

}
}