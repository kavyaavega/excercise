package com.avega.training.java.selflearningtopics;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class NioMoveFile {

	public static void main(String[] args) {
	try {
			
			System.out.println("started:"+ new Date());
			Path sorce = Paths.get("C:\\Demo\\kavya\\example3.txt");
			Path destination = Paths.get("C:\\Demo\\kavya\\file2\\example3.txt");
			Files.move(sorce, destination);
			
			System.out.println("completed:"+new Date());
	
		}
		catch(Exception e)	{
			e.printStackTrace();
		}
	}

}
