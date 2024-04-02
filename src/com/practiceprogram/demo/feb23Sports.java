/*Write a Java program to create a base class Sports with a method called play().
 Create three subclasses: Football, Basketball, and Rugby. Override the play() method 
 in each subclass to play a specific statement for each sport.*/

package com.practiceprogram.demo;

class Football extends feb23Sports
{
	public void play()
	{
		System.out.println("footBal....");
	}
}
class Basketball extends feb23Sports
{
	public void play()
	{
		System.out.println("basketBall....");
	}
}
class Rugby extends feb23Sports
{
	public void play()
	{
		System.out.println("Ruby is a nice game");
	}
}
public class feb23Sports {

	public void play()
	{
		System.out.println("play sports ");
	}
	public static void main(String[] args) {
		feb23Sports sp=new feb23Sports();
		Football fb=new Football();
		Basketball bb=new Basketball();
		Rugby r=new Rugby();
		
		sp.play();
		fb.play();
		bb.play();
		r.play();
	}

}
