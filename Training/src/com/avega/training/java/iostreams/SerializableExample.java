package com.avega.training.java.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class SerializableExample {

	public static void main(String[] args) throws IOException {
		Book book = new Book("101","java",120,LocalDate.of(2023, 05, 20));
		/*FileOutputStream fout = new FileOutputStream("C:\\demo\\seralizableexample.txt");
		ObjectOutputStream obj = null;
		try {
			obj = new ObjectOutputStream(fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.writeObject(book);*/
		
		//String readStr=  null;
		FileInputStream fin = new FileInputStream("C:\\demo\\seralizableexample.txt");
		ObjectInputStream objIn = new  ObjectInputStream (fin);
		
		try {
		System.out.println(objIn.readObject());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(book);

	}

}
