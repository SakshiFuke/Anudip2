//8feb24
/*Write a Java program to create a class called "Rectangle" with width and height  
attributes. Calculate the area and perimeter of the rectangle.*/

package com.practiceprogram.demo;

public class rectangle {
	//atributes 
	double width;
	double height;
	
	public rectangle(double width , double height)
	{
		this.width=width;
		this.height=height;
	}
	public void Area()
	{
		double area=width *height;
		System.out.println("Area of rectangle = " + area);
	}
	public void perimeter()
	{
		double perimeter= 2*(width+height);
		System.out.println("perimeter of rectangle = "+perimeter );
	}
	public static void main(String[] args) {
		
		rectangle re=new rectangle(2.0,3.0);
		re.Area();
		re.perimeter();
		
		
	}

}

