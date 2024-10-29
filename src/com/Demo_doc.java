package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Demo_doc {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the data");
	String s=sc.next();
	try {
		FileOutputStream fos=new FileOutputStream("D://java/Demo_doc.doc");
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println(Arrays.toString(b));
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
