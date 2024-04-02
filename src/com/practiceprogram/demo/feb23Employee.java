/*Write a Java program to create a class Employee with a method called calculateSalary().
Create two subclasses Manager and Programmer. In each subclass, override the 
calculateSalary() method to calculate and return the salary based on their specific roles.*/
package com.practiceprogram.demo;

class Manager extends feb23Employee
{
	double baseSalary;
	double bonus;
	
	public Manager(String name, double baseSalary, double bonus)
	{
		super(name,"Manager");
		this.baseSalary=baseSalary;
		this.bonus=bonus;
	}
	public double calculateSalary()
	{
		return baseSalary+bonus;
	}
}
class Programmer extends Manager
{
	double baseSalary;
	double overtimePay;
	
	public Programmer(String name, double baseSalary, double overtimePay) 
	{
		super(name,baseSalary,overtimePay);
		this.baseSalary=baseSalary;
		this.overtimePay=overtimePay;
	}

	public double calculateSalary()
	{
		return baseSalary+overtimePay;
	}
}
public class feb23Employee {

	String name;
	String role;
	
	public feb23Employee(String name, String role)
	{
		this.name=name;
		this.role=role;
	}
	public String getname()
	{
		return name;
	}
	public String getrole()
	{
		return role;
	}
	public double calculateSalary()
	{
		return 0.0;
	}
	public static void main(String[] args) {
		feb23Employee emp1 = new Manager("Sakshi", 7500.0, 1500.0);
		feb23Employee emp2 = new Programmer("Fuke", 5000.0, 600.0);

        System.out.println("Manager: " + emp1.getname() + "\nRole: " + emp1.getrole() + "\nSalary: " + emp1.calculateSalary());
        System.out.println("\nProgrammer: " + emp2.getname() + "\nRole: " + emp2.getrole() + "\nSalary: " + emp2.calculateSalary());
    }
		
	

}
