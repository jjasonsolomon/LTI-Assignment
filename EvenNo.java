package com.corejava;

import java.util.Scanner;

public class EvenNo {
	public static void main(String[] args)
	{
		int op;
		System.out.println("1.For Loop\n2.While\n 3.Do...While\n");
		Scanner in = new Scanner(System.in);
		op=in.nextInt();
		switch(op)
		{
		case 1:
			forloop();
			break;
			
		case 2:
			whileloop();
			break;
			
		case 3:
			dowhileloop();
			break;
			default:
				System.out.println("Invalid");
				break;
				
		}
		
	}

	private static void dowhileloop() {
		int j = 1;
		// TODO Auto-generated method stub
		do{
			if(j%2==0)
			{
				System.out.println("\n"+j);
			}
			j++;
		}while( j<=50);
		
	}

	private static void whileloop() {
		int k=1;
		// TODO Auto-generated method stub
		while(k<=50)
		{
			if(k%2==0)
			{
				System.out.println("\n"+k);
			}
			k++;
		}
		
	}

	private static void forloop() {
		
		
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println("\n"+i);
			}
		}
		
	}

}
