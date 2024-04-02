//Write a Java program to display the cube of the given number up to an integer.

package com.practiceprogram.demo;

import java.util.Scanner;

public class CubeOfNo {

	public static void main(String[] args) {
		
		int i,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number =");
	    n=sc.nextInt();
	
		for(i=0;i<=n;i++) {
		System.out.println("Cube of " + i + " is ="+(i*i*i));
		}
	}

}
