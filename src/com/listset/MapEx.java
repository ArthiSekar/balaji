package com.listset;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		
		Map<String, Integer> m= new LinkedHashMap<>();
		
		m.put("Tamil", 100);
		m.put("English", 400);
		m.put("maths",500);
		m.put("Science", 700);
		m.put("Tamil",200);
		m.put("Social",300);
		
		System.out.println(m);
		
		m.put("rayg", 300);
		
		Integer integer = m.get("maths");
		System.out.println(integer);
		
		boolean empty = m.isEmpty();
		System.out.println(empty);
		
		m.remove("Tamil");
		System.out.println(m);
		
		m.replace("maths", 500, 700);
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values = m.values();
		System.out.println(values);
		
		boolean containsKey = m.containsKey("sss");
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue(300);
		System.out.println(containsValue);
		
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		System.out.println("***********enhancedforloop************");
		
		for (Entry<String, Integer> e : entrySet) {
			System.out.println(e);
		}
		
		System.out.println("*****enhanced for loop***key***value");
		
		for (Entry<String, Integer> f : entrySet) {
			//Integer value = f.getValue();
			//System.out.println(value);
			
			//String key = f.getKey();
			//System.out.println(key);
			
			
			
			System.out.println(f.getKey());
			System.out.println(f.getValue());
			System.out.println("");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
