package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
public static void main(String[] args) {
	try {
		FileReader fr=new FileReader("D://java/filehandelingprogram.txt");
		long length=new File("D://java/filehandelingprogram.txt").length();
		for(int i=0;i<length;i++)
		System.out.print(" "+(char)fr.read());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("handled");
	}
}
}
