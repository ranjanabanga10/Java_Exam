package Exam;

import java.util.*;


public class uniqueNumber {
	/*
	 * Write a java program to store 5 unique elements in sorted order. 
	 * Error should exist if user tries to add duplicates.
	 */

	public static void main(String[] args) 
	{
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(22);
		set.add(12);
		set.add(34);
		set.add(22);
		set.add(10);
		set.add(8);
		
		Iterator<Integer> i=set.iterator();  
        while(i.hasNext())  
        { 
        System.out.println(i.next());  
        }  
	}

}
