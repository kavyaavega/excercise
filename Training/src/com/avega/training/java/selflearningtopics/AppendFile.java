package com.avega.training.java.selflearningtopics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendFile {

	public static void main(String[] args) throws IOException {
		
    Path path = Paths.get("C:\\Demo\\kavya\\example4.txt");
    String sentence = "This is an example to append the file";
     for (int i = 0; i < 10; i++) {
        Files.write(path, ("\n" + sentence + " " + i).getBytes(), StandardOpenOption.APPEND);
   }
 }
}
