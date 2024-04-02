package com.lab7;

public class ArrayStringObj {
	public static void main(String[] args) {
		
		char[] arr_num=new char[] {'1','2','3','4','5'};
		
		String str = String.copyValueOf(arr_num,1,3);
		
		System.out.println("this website have "+str+" pages");
	}

}
