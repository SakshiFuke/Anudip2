package com.lab6;

import java.util.Scanner;

class AgeException extends Exception
{
	public AgeException(String message)
	{
		super(message);
	}
}
public class VotingAppli_mar14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		
		try
		{
			checkAge(age);
			System.out.println("you are eligible for votting");
		}
		catch(AgeException ae)
		{
			System.out.println("you are not eligible for votting"+ae.getMessage());
		}
		
	}

	private static void checkAge(int age) throws AgeException {
		if(age<18)
		{
			throw new AgeException('\n'+"Exception :You must be above 18 for votting");
		}
		
	}
}
/* -----OutPut-----
1-->enter your age: 
	5
	you are not eligible for votting
	Exception :You must be above 18 for votting

2-->enter your age: 
	20
	you are eligible for votting

*/
