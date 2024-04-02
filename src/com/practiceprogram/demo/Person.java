//8feb24

/*Write a Java program to create a class called "Person" with a name and age attribute.
Create two instances of the "Person" class, set their attributes using the constructor,
and print their name and age.*/

package com.practiceprogram.demo;

public class Person {
	//atributes
	private String name ;
	private int age;
	
	//construct a cunstructor
	public Person(String name, int age) {

		this.name=name;
		this.age=age;
	}
	
	//return name
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public static void main(String[] args) {

		Person p1 = new Person("Sakshi",21);
		Person p2 = new Person("isha",21);
		
		System.out.println("the name of 1st person is "+ p1.getName()+" and age is "+p1.getAge());
		System.out.println("the name of 2nd person is "+ p2.getName()+" and age is "+p2.getAge());
	}

}
