package com;

import java.io.FileWriter;
import java.io.IOException;

public class Example2 {
	public static void main(String[] args) {
		try {
			FileWriter fr=new FileWriter("D://java/Example.xls",true);
			fr.write("Java|Sql");
			fr.flush();
			fr.close();
			System.out.println("Data is Stored");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
