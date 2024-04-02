/*Write a Java program to create a class called Shape with a method called getArea(). 
 Create a subclass called Rectangle that overrides the getArea() method to 
 calculate the area of a rectangle.*/
package com.practiceprogram.demo;

class Shape {
	
	public double getArea()
	{
		return 0.0;
	}
}
public class feb15Rectangle extends Shape
{
	double l=5;
	double b=6;
	double Area =l*b;
	@Override
	public double getArea()
	{
		System.out.println("Area of rectangle = " + Area);
		return Area;	
	}

	public static void main(String[] args) {

		feb15Rectangle r=new feb15Rectangle();
		r.getArea();
	}

}
