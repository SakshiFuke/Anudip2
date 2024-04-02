package com.lab6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExceptionDemo_mar14 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter a number : ");
			int a=sc.nextInt();
//			System.out.println(a*a);
		}
		catch(InputMismatchException me)
		{
			System.out.println(me);
		}
	}

}
