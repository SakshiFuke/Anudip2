//Create a Car object named myCar. Call the fullThrottle() and speed() methods on the
//myCar object, and run the program
package com.practiceprogram.demo;

public class MyCar {

		int x=5;
		public void fullThrottle()
		{
			System.out.println("the value of x "+x);
		}
		public void speed()
		{
			System.out.println("the value of x "+x);
		}

		public static void main(String[] args) {

			MyCar ca=new MyCar();
			ca.fullThrottle();
			ca.speed();

	}

}
