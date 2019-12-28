package week1;

import abstraction.StdOut;

public class Week1 
{

	public static void main(String[] args) 
	{
		for(int i = 1; i <= 10; i++)
		{
			int j = (int) (Math.random() * i);
			StdOut.println(j + ". Hello, World");
			StdOut.println();
		}
		
		StdOut.println(Double.NEGATIVE_INFINITY);
		
		StdOut.println(6e2);
	}

}
