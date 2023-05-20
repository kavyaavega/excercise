package com.avega.training.java.iostreams;

import java.io.CharArrayWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class CharacterArrayWriter {

	public static void main(String[] args) throws IOException {
		CharArrayWriter cout = new CharArrayWriter();
		
		//String str = "This is a example for char array writer";
		Book book = new Book("101","java",120,LocalDate.of(2023, 05, 20));

		
			try {
				cout.write(book.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			FileWriter fwr = null;
			try {
				fwr = new FileWriter("C:\\demo\\kavya\\example1.txt");
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
			FileWriter fwr1 = null;
			try {
				fwr1 = new FileWriter("C:\\demo\\kavya\\example2.txt");
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
			
			FileWriter fwr2 = null;
			try {
				fwr2 = new FileWriter("C:\\demo\\kavya\\example3.txt");
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
			
			FileWriter fwr3 = null;
					try {
						fwr3 = new FileWriter("C:\\demo\\kavya\\example4.txt");
					}
			
			catch(FileNotFoundException e){
				e.printStackTrace();
			}
					
			try {
				cout.writeTo(fwr);
				cout.writeTo(fwr1);
				cout.writeTo(fwr2);
				cout.writeTo(fwr3);
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
			finally {
				fwr.close();
				fwr1.close();
				fwr2.close();
				fwr3.close();
			}
	}

}
