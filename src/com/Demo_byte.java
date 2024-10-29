package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Demo_byte 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();//data
			
		try {
			FileOutputStream fos=new FileOutputStream("D://java/Demo_byte.txt");
			byte b[]=s.getBytes();
			
			fos.write(b);//to store the data
			fos.flush();
			fos.close();
			System.out.println(Arrays.toString(b));//to read the array data
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
