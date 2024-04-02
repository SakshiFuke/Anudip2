/*Write a Java program to create an abstract class Shape with abstract methods 
 calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that 
 extend the Shape class and implement the respective methods to calculate the area and 
 perimeter of each shape.*/
package com.practiceprogram.demo;

abstract class Shapes
{
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}

class Circles extends Shapes
{
	private double radius;
	
	public Circles(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 3.14*radius*radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2*3.14*radius;
	}
	
}

class Triangles extends Shapes
{
	private double a;
	private double b;
	private double c;
	
	public Triangles(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double calculateArea() {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s - a) * (s - b) * (s - c));
	}

	@Override
	public double calculatePerimeter() {
		return a+b+c;
	}
}
public class mar06Shapes {

	public static void main(String[] args) {
		
		Circles c=new Circles(2.5);
		
		System.out.println("Area of circle is : "+c.calculateArea());
		System.out.println("perimeter of Circle : "+c.calculatePerimeter());
		
		Triangles t=new Triangles(2.3,2.5,5.8);
		System.out.println("Area of Triangle is : "+t.calculateArea());
		System.out.println("perimeter of triangle : "+t.calculatePerimeter());

	}

}
