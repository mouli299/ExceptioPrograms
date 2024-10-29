package com;

import java.io.File;
import java.io.IOException;

public class Demo 
{
	public static void main(String[] args) 
	{
		File f=new File("Demo.txt");
		try {
			boolean b=f.createNewFile();
			System.out.println(b);
		} catch (IOException e) {
		System.out.println("Handeled");
		}
	}
}
