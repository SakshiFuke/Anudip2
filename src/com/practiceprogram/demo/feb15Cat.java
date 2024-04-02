/*Write a Java program to create a class called Animal with a method called makeSound().
  Create a subclass called Cat that overrides the makeSound() method to bark.*/
package com.practiceprogram.demo;

class Animal_sound
{
	public void makeSound()
	{
		System.out.println("sound");
	}
}
public class feb15Cat extends Animal_sound{

	@Override
	public void makeSound()
	{
		System.out.println("bark");
	}
	public static void main(String[] args) {

		feb15Cat c=new feb15Cat();
		c.makeSound();
	}

}
