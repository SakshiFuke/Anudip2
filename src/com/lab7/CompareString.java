package com.lab7;

public class CompareString {

	public static void main(String[] args) {

		String str1="Sakshi" , str2="Fuke";
		CharSequence cs="Sakshi";
		
		System.out.println("Comparing "+str1+" and "+cs+":"+str1.contentEquals(cs));
		System.out.println("Comparing "+str2+" and "+cs+":"+str2.contentEquals(cs));
	}

}
