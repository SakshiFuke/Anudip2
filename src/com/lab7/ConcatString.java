package com.lab7;

public class ConcatString {

	public static void main(String[] args) {
		
		String str1="My Name is";
		String str2=" Sakshi Fuke";
		
		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str2);
		
		String str3=str1.concat(str2);
		
		System.out.println("Result String is: "+str3);
		
	}

}
