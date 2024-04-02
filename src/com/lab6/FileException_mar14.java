package com.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException_mar14 {
	public static void main(String[] args) {
		try
		{
			readFile("text1.txt");
		}
		catch(FileNotFoundException ex) 
		{
			System.out.println("Error: "+ex.getMessage());
		}
	}

	private static void readFile(String FileName) throws FileNotFoundException{
		File f=new File(FileName);		
		Scanner sc=new Scanner(f);
		
		while(sc.hasNextLine())
		{
			String l = sc.nextLine();
			System.out.println(l);
		}
	}

}
