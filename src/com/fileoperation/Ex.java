package com.fileoperation;

import java.io.File;
import java.io.IOException;

public class Ex {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Framework\\java\\abc.txt");
		
		//to create new directory
		///boolean mkdir = f.mkdir();
		//System.out.println(mkdir);
		
		
		//to create new file
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		
		boolean canRead = f.canRead();
		System.out.println(canRead);
		
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		
		boolean exists = f.exists();
		System.out.println(exists);
		
		boolean file = f.isFile();
		System.out.println(file);
		
		boolean directory = f.isDirectory();
		System.out.println(directory);
		
		System.out.println("********list*****");
		
		File f2=new File("C:\\Users\\Dell\\Desktop\\Balaji\\9.7.22");
		
		String[] list = f2.list();
		for (String x : list) {
			System.out.println(x);
			
		}
		System.out.println("********list files************");
		
		File[] listFiles = f2.listFiles();
		for (File y : listFiles) {
			System.out.println(y);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
