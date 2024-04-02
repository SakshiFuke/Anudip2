/*Write a Java program to create a class called Animal with a method named move().
  Create a subclass called Cheetah that overrides the move() method to run.*/
package com.practiceprogram.demo;

class Animal{

	public void move()
	{
		System.out.println("moving");
	}
}
public class feb15Cheetah extends Animal
{
	@Override
	public void move()
	{
		System.out.println("cheetah");
	}

	public static void main(String[] args) {

//		feb15Animal a=new feb15Animal();
//		a.move();
		feb15Cheetah c=new feb15Cheetah();
		c.move();
	}

}
