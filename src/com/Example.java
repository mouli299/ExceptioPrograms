package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example 
{
	public static void main(String[] args) {
		File f=new File("D://java/filehandelingprogram.txt");
		try {
			FileWriter fr=new FileWriter(f);
			fr.write("java");
			fr.flush();
			fr.close();
			System.out.println("Data stored");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
