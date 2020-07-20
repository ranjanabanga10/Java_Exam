package Exam;

import java.util.*;

public class vectorProblem 
{
	/*
	 * Write a program to insert "tekarch" into vector then insert 
	 * user inputed number(N) of Z's from 3rd position.delete N charactors 
	 * from 6th position from vectorExample:if user input =5Then 
	 * vector stores="tekZZZZZarch"Delete 5 character from 6th position 
	 * so final string="tekZZZh"
	 */
	public static void main(String[] args) 
	{
		//Create a vector  
        Vector<String> vec = new Vector<String>();  
        //Adding elements using add() method of List  
        vec.add("t");
        vec.add("e");
        vec.add("k");
        vec.add("a");
        vec.add("r");
        vec.add("c");
        vec.add("h");
       
        int num=0;
        String usrchrs="Z";
        System.out.println("User enter number::");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
       
        for(int i=0;i<=num;i++) {
        	 vec.add(3, usrchrs);
        	 
        }
        for(int j=0;j<vec.size();j++) {
        	vec.removeElementAt(5);
        }
        
        Iterator<String> itr=vec.iterator();
        while(itr.hasNext()) {
        	
            System.out.print(itr.next());
        }
        
        //System.out.println("Elements are: "+vec);  
	}

}
