package com.listset;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListDupTask2 {
	public static void main(String[] args) {
	
	List<Integer> li=new ArrayList<Integer>();
	
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(10);
	li.add(40);
	li.add(50);
	li.add(40);
	
	
	System.out.println(li);
	
	Set<Integer> s=new LinkedHashSet<>();
	
	
	s.addAll(li);
	System.out.println(s);
	

	

}
}
