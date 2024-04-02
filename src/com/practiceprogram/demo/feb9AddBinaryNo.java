//9feb24

/*Write a Java program to add two binary numbers.*/

package com.practiceprogram.demo;

import java.util.Scanner;

public class feb9AddBinaryNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first binary number = ");
		String b1=sc.next();
		
		System.out.println("Enter second binary number = ");
		String b2=sc.next();
		
		String sum=b1+b2;
		System.out.println("Sum of two binary number = " + sum);
	}

}
