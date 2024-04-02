/*Write a Java program to create an abstract class Vehicle with abstract methods 
startEngine() and stopEngine(). Create subclasses Car and Motorcycle that extend the 
Vehicle class and implement the respective methods to start and stop the engines for 
each vehicle type.*/
package com.practiceprogram.demo;

abstract class Vehical
{
	public abstract void startEngine();
	public abstract void stopEngine();
}
class Car1 extends Vehical
{
	@Override
	public void startEngine() {
		System.out.println("the car engine is started ");	
	}
	@Override
	public void stopEngine() {
		System.out.println("the car engine is stop");
	}
}
class Motorcycle extends Vehical 
{
	@Override
	public void startEngine() {
		System.out.println("the Motorcycle engine is started");
	}
	@Override
	public void stopEngine() {
		System.out.println("the motorcycle engine is stop");
	}
}
public class mar06Vehical {
	public static void main(String[] args) {
		Car1 c=new Car1();
		Motorcycle m=new Motorcycle();
		
		c.startEngine();
		c.stopEngine();
		
		m.startEngine();
		m.stopEngine();

	}

}
