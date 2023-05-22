package com.avega.training.java.selflearningtopics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Path-represent the path to actual file or directory you are willing to work
//Paths-helps to load the path from a string to URI
//Path p = Paths.get("Location of the file.extention");

public class NioCreateFile {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\demo\\javaprogram.txt"); //creates Path instance  
		try   
		{  
		//Path p= Files.createFile(path);     //creates file at specified location  
		//System.out.println("File Created at Path: "+p); 
		
		
		// write into the file
		String str = "nio create and writing into the file";
		Files.write(path, str.getBytes());
		
		String str1 = "nio create and writing into the file examples";
		Files.write(path, str1.getBytes());
		
		List<String> stringList = Stream.of(str,str1, "str2","str3","str4").collect(Collectors.toList());
		Files.write(path, stringList);
		
		//	read data from files to console
		Files.lines(path).forEach(System.out::println);
		// read from files
		List<String> data = Files.readAllLines(path);
		for(String s: data) {
			System.out.println(s);
		}
		
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}  
	}
}
