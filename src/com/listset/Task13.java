package com.listset;

import java.util.LinkedList;
import java.util.List;

public class Task13 {
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
		
		//to iterate the list using for loop
		System.out.println("*****for loop*****");
		
		for(int i=0;i<li.size();i++) {
			
			System.out.println(li.get(i));
		}
		

}
}