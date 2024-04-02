//9feb24
/*Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
*/
package com.practiceprogram.demo;

public class feb9Operation {

	public static void main(String[] args) {

		int result1=(-5+8*6);
		System.out.println("-5+8*6 = " + result1);

		int result2= (55+9) % 9;
		System.out.println("(55+9) % 9 = "+result2);
		
		int result3=20 + -3*5 / 8;
		System.out.println("20 + -3*5 / 8 = " + result3);
		
		int result4=5+15/3*2-8%3;
		System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " +result4);
	}

}
