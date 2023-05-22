package com.avega.training.java.selflearningtopics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDelete {

	public static void main(String[] args) {
		 // create object of Path
        Path path
            = Paths.get("C:\\demo\\javaprogram.txt");
 
        // delete File
        try {
            Files.delete(path);
           //Files.deleteIfExists(path);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

	}

}
