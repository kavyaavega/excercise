package com.avega.training.java.selflearningtopics;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInNio {

	public static void main(String[] args) {
		
		Path relative = Paths.get("file2.txt");
	      System.out.println("Relative path: " + relative);
	      
	      Path absolute = relative.toAbsolutePath();
	      System.out.println("Absolute path: " + absolute);

	}

}
