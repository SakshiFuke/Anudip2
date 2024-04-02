package com.practiceprogram.demo;
class Car extends feb15Vehical
{
	@Override
	public void drive()
	{
		System.out.println("Car is driving by man");
	}
	
}
public class feb15Vehical {

	public void drive()
	{
		System.out.println("nothing");
	}

	public static void main(String[] args) {

		Car c= new Car();
		c.drive();
		
	}

}
