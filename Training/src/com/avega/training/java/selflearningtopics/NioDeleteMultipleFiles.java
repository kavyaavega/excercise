package com.avega.training.java.selflearningtopics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDeleteMultipleFiles {

	public static void main(String[] args) {
		// create object of Path
        Path pathOfFile1
            = Paths.get("C:\\demo\\kavya"
                        + "\\example1");
        Path pathOfFile2
            = Paths.get("C:\\demo\\kavya"
                        + "\\example2");
 
        // delete both Files
        try {
 
            Files.delete(pathOfFile1);
            Files.delete(pathOfFile2);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	}

}
