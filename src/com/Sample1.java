package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sample1 {
public static void main(String[] args) {
	try {
		FileInputStream fis=new FileInputStream("D://java/Demo_byte.txt");
		int size=fis.available();
		byte b[]=new byte[size];
		fis.read(b);
		String s=new String(b);
	int num=Integer.parseInt(s);
	System.out.println(num);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

