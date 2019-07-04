package com.corejava;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String [] args)
	{
		int no,rem,sum = 0;
		Scanner in = new Scanner(System.in);
		
		no=in.nextInt();
		while(no!=0)
		{
			rem=no%10;
			sum=rem+(sum);
			no=no/10;
		}
		System.out.println("Sum of digits=" +sum);
		
		
	}

}
