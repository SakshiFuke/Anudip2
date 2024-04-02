package com.lab7;

public class ContainsString {

	public static void main(String[] args) {
		String str1="My Name is Sakshi Fuke";
		String str2="is";
		
		System.out.println("Origanal String : "+str1);
		System.out.println("specified sequence of char values: "+str2);
		
		System.out.println(str1.contains(str2));
	}

}
