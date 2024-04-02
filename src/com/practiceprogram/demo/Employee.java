//8feb24

/*Write a Java program to create a class called "Employee" with a name, job title, 
  and salary attributes, and methods to calculate and update salary.*/

package com.practiceprogram.demo;

public class Employee {

	String name;
	String jobTitle;
	double salary;
	
	public String name()
	{
		return name;
	}
	public String jobTitle()
	{
		return jobTitle;
	}
	public double Salary()
	{
		return salary;
	}
	
	public Employee(String name, String jobTitle, double salary)
	{
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	public double claculateSalary()
	{
		return salary=salary*12;
	}
	public void udateSalary(double newSalary)
	{
		this.salary=newSalary;
		System.out.println("updated Salary of " + name +" is " + salary);
	}
	
	public static void main(String[] args) {

		Employee em = new Employee("Sakshi Fuke","Software engineer",20000.56);
	
		System.out.println("Employee " + em.name +" "+em.jobTitle +"Salary is " +em.salary);
		System.out.println("the anual salary of is " +em.claculateSalary());
		em.udateSalary(35000.91);
	}

}
