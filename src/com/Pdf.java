package com;

import java.io.File;
import java.io.IOException;

public class Pdf 
{
public static void main(String[] args) 
{
	File f=new File("Text.txt");
	try {
		boolean b=f.createNewFile();
		System.out.println(b);
	} 
	catch (IOException e) 
	{
		System.out.println("Handeled");
	}
}
}
