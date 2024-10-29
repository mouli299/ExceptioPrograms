package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.next();
		File f=new File("D://java/Demo1.txt");
		try {
//			long l=f.length();
			FileWriter fr=new FileWriter(f);
			fr.write(st);
			fr.flush(); 
			fr.close();
			System.out.println("Data stored");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
////		rough
//		
//		FileReader fr=new FileReader("D://java/Demo1.txt");
//		long length=new File("D://java/Demo1.txt").length();
//		String s="";
//		for(long i=0;i<length();i++)
//			{
//				s=s+(char)fr.read(i);
//			}
//		System.out.println(s);
//		
		
		
		System.out.println("----------------------------------------------");
		try {
			FileReader fr=new FileReader("D://java/Demo1.txt");
			long length=new File("D://java/Demo1.txt").length();
			String rev="";
			String s="";
			for(long i=0; i<length;i++)
			{
				s=s+(char)fr.read();
			}
			for(int i=s.length()-1;i>=0;i--)  
				rev=rev+s.charAt(i);
			System.out.print(rev);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("handled");
		}
	}

//	private static long length() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
