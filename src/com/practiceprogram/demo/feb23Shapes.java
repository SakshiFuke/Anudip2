/*Write a Java program to create a base class Shape with methods draw() and 
calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the 
draw() method in each subclass to draw the respective shape, and override the 
calculateArea() method to calculate and return the area of each shape.*/
package com.practiceprogram.demo;

class circless extends feb23Shapes
{
	private double radius;
	
	public circless(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("draw a circle ");
	}

	public double claculateArea() {
	
		return Math.PI*radius*radius;	
	}
}
class Square extends feb23Shapes
{
	private double length;
	private double width;
	
	public Square(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	public void draw() {
		System.out.println("draw a rectangle ");
	}
	@Override
	public double claculateArea() {
		return length*width;
	}
}
class Triangle extends feb23Shapes
{
	private double base;
	private double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("draw a triangle");
	}

	@Override
	public double claculateArea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}
	
}
public abstract class feb23Shapes {

	public abstract void draw();
	public abstract double claculateArea();

	public static void main(String[] args) {

		feb23Shapes ci=new circless(1.5);
		ci.draw();
		System.out.println("area of circle = "+ci.claculateArea());
		feb23Shapes sq=new Square(2.6,5.9);
		sq.draw();
		System.out.println("area of Square = "+sq.claculateArea());
		feb23Shapes tr=new Triangle(2.0,3.0);
		tr.draw();
		System.out.println("area of triangle = "+tr.claculateArea());

	}

}
