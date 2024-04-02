/*Write a Java program to create an abstract class Employee with abstract methods 
calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that 
extend the Employee class and implement the respective methods to calculate salary and 
display information for each role.*/
package com.practiceprogram.demo;

abstract class Employee1
{
	protected String name;
	protected double baseSalary;
	
	public Employee1(String name, double baseSalary) 
	{
		this.name = name;
		this.baseSalary = baseSalary;
	}
	public abstract double calculateSalary();
	public abstract void displayInfo();
}
class Manager1 extends Employee1
{
	private double bonus;

	public Manager1(String name, double baseSalary, double bonus) 
	{
		super(name, baseSalary);
		this.bonus = bonus;
	}
	@Override
	public double calculateSalary() {
		return baseSalary+bonus;
	}
	@Override
	public void displayInfo() 
	{
		System.out.println("manager name : "+name);
		System.out.println("base Salary : "+baseSalary);
		System.out.println("Bonus : "+bonus);
		System.out.println("total salary : "+calculateSalary());
	}
}
class Programmer1 extends Employee1
{
	private int overtimeHours;
	private double hourlyRate;
	
	public Programmer1(String name, double basesalary, int overtimeHours, double hourlyRate) 
	{
		super(name, basesalary);
		this.overtimeHours = overtimeHours;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		return baseSalary+(overtimeHours*hourlyRate);
	}
	@Override
	public void displayInfo() {
		System.out.println("name of programmer : "+name);
		System.out.println("baseSalary of programmer : "+baseSalary);
		System.out.println("Overtime Hours : "+overtimeHours);
		System.out.println("Hourly Rate : "+hourlyRate);
		System.out.println("total salary : "+calculateSalary());
	}
	
}
public class mar06Employee {
	public static void main(String[] args) {
		
		Manager1 m=new Manager1("Sakshi", 25000.0, 5000);
		Programmer1 p=new Programmer1("Fuke", 20000.0, 25,  200);
		
		m.displayInfo();		
		p.displayInfo();
	}

}
