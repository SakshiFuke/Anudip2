//Write a Java program to get a number from the user and print whether it is positive 
// or negative.

package com.practiceprogram.demo;

import java.util.Scanner;

public class PtiveNtiveNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number=");
		int i=sc.nextInt();
		if(i>=0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
		
	}

}
