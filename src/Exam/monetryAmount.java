package Exam;

import java.io.Console;
import java.util.Scanner;

public class monetryAmount 
{
	/*
	 * Write a program to read monetary amount in cents and 
	 * print the smallest possible number of coins equaling the amount. 
	 * Example: monetary amount in cents=288 2 Dollar 3 quarter 1 dime 3 pennies 
	 * So smallest possible number of coins equaling the amount 283====9 coins
	 */
	public static void main(String[] args) 
	{
		
		
		int amount;
		int dollers, quarters, dimes,nickels, pennies;
		
		System.out.println("Enter the amount in cents::");
		Scanner in=new Scanner(System.in);
		
		amount=in.nextInt();
		dollers=Math.round((int)amount/100);
		amount=amount%100;
		quarters=Math.round((int)amount/25);
		amount=amount%25;
		dimes=Math.round((int)amount/10);
		amount=amount%10;
		nickels=Math.round((int)amount/5);
		amount=amount%5;
		pennies=Math.round((int)amount/1);
		
		int count=dollers+quarters+dimes+nickels+pennies;
		
		System.out.println("Dollers: " + dollers);
	    System.out.println("Quarters: " + quarters);
	    System.out.println("Dimes: " + dimes);
	    System.out.println("Nickels: " + nickels);
	    System.out.println("Pennies: " + pennies);
	    System.out.println("No. of coins for this amount::"+count);
	}

}
