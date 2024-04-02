//8feb24

/*Write a Java program to create a class called "Circle" with a radius attribute. You
can access and modify this attribute. Calculate the area and circumference of the circle.
circumference=2*3.14*r
area=3.14*r*r           											
*/

package com.practiceprogram.demo;

public class Circle {
	
	double radius=2.5;
	
	public void area()
	{
		double area=3.14*radius*radius;
		System.out.println("the area of acircle = " + area);
	}
	public void circumference()
	{
		double circumference=2*3.14*radius;
		System.out.println("the circumference of a circle is = " + circumference);
	}
	public static void main(String[] args) {
		
		Circle ci =new Circle();
		ci.area();
		ci.circumference();
		
	}

}
