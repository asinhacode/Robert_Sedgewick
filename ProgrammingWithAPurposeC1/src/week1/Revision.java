/**
 * Put everything in a method
 * 
 * A method must return a data type or void
 * 
 * Programming Stages:
 * 
 * EDIT >> COMPILE >> ERROR >> GO BACK To EDIT
 *  			   >> CORRECT >> RUN >> ERROR >> GO BACK To EDIT
 *  								 >> CORRECT
 *  
 * CYCLIC DEVELOPMENT
 */

package week1;

import java.util.Scanner;

public class Revision 
{

	public static void main(String[] args) 
	{
		/**
		 * DATA TYPES:
		 * 
		 * char
		 * String
		 * int
		 * double
		 * boolean
		 */
		
		/**
		 * int a; declaration
		 * 
		 * a = 0; assignment
		 * 
		 * 0 = literals
		 * 
		 * 
		 */
		/*
		 * String r1 = "1"; String r2 = r1 + " 2 " + r1; String r3 = r2 + " 3 " + r2;
		 * String r4 = r3 + " 4 " + r3;
		 * 
		 * System.out.println(r1); System.out.println(r2); System.out.println(r3);
		 * System.out.println(r4);
		 */
		
		
		Scanner s = new Scanner(System.in);
		
		/*
		 * System.out.println("Enter 1st number:\t"); int s1 = s.nextInt();
		 * 
		 * System.out.println("Enter 2nd number:\t"); int s2 = s.nextInt();
		 * 
		 * int t = s1; s1 = s2; s2 = t;
		 * 
		 * System.out.println(s1 + " " + s2);
		 */
		
		// roots of quadratic equations.
		// a, b, c
		
		// x2+5x+6 = 0.
		
		/*
		 * System.out.println("Enter A:\t"); double a = s.nextDouble();
		 * 
		 * System.out.println("Enter B:\t"); double b = s.nextDouble();
		 * 
		 * System.out.println("Enter C:\t"); double c = s.nextDouble();
		 * 
		 * double discriminant = Math.pow(b, 2) - (4 * a * c); double sRoot =
		 * Math.sqrt(discriminant);
		 * 
		 * double root1 = (-b + sRoot) / 2; double root2 = (-b - sRoot) / 2;
		 * 
		 * System.out.println(root1 + "\n" + root2);
		 */
		
		// leap year
		
		/*
		 * System.out.println("Enter a year:\t"); int year = s.nextInt();
		 * 
		 * boolean leap = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		 * 
		 * System.out.println(leap);
		 */
		
		double r = Math.random();
		System.out.println("Enter your upper limit:\t");
		int upper = s.nextInt();
		
		System.out.println((int) (r * upper));
		

		s.close();
		
		/**
		 * NaN = Not A Number
		 * 
		 */

		
		
	}

}
