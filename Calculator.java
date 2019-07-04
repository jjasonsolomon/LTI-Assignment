package com.corejava;
import java.util.*;

public class Calculator {
	private static int var1;
	private static int var;

	private static int var2;
	static Scanner in = new Scanner (System.in);
	public static void get()
	{
		System.out.println("Enter Number 1\n");
	
		var1=in.nextInt();
		System.out.println("Enter Number 2\n");
		
		var2=in.nextInt();
	}
	public static void get1()
	{
		System.out.println("Enter Number\n");
	
		var=in.nextInt();
		
	}
	public static void put(int x)
	{
		System.out.println(x);
	}
	
public static void main(String[] args )
{
	int op;
    int tot;
    jm:
	System.out.println("1.Addition\n2.Subtraction \n3.Multiplication \n4.Division \n5.Square\n6.Square Root\n");
	op=in.nextInt();
	switch(op)
	{
	case 1:
		
	get();
	tot=var1+var2;
	put(tot);
	break;
	case 2:
		get();
		tot=var1-var2;
		put(tot);
		break;
	case 3:
		get();
		tot=var1*var2;
		put(tot);
		break;
	case 4:
		get();
		tot=var1/var2;
		put(tot);
		break;
	case 5:
		get1();
		tot=(int)Math.pow(var, 2);
		put(tot);
		
		break;
	case 6:

		get1();
		tot=(int)Math.sqrt(var);
		put(tot);
		
		break;
		default:
			System.out.println("Invalid\n");
			break;
		
	}
	
		
			
			
}
}
