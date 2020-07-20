package Exam;

import java.util.*;


public class StudentRank {

	/*
	 * Write a java program to store 5 student information 
	 * and award the students with 1st rank, 2nd rank and 
	 * 3rd rank according to marks obtained where each student 
	 * has student name, student marks and student reg 
	 * no information
	 */
	public static void main(String[] args) 
	{
		HashMap<Integer, List<String>> Student =new HashMap<Integer,List<String>>();
		List<String> s1=new ArrayList<String>();
		List<String> s2=new ArrayList<String>();
		List<String> s3=new ArrayList<String>();
		List<String> s4=new ArrayList<String>();
		List<String> s5=new ArrayList<String>();
		List<String> eachValue=new ArrayList<String>();
		String name="", rank="";
		int temp=0;
		int total=0;
		s1.add("Ranjana");
		s1.add("80");
		s2.add("Justin");
		s2.add("60");
		s3.add("Pooja");
		s3.add("90");
		s4.add("Aditi");
		s4.add("90");
		s5.add("Sahil");
		s5.add("40");

		Student.put(1, s1);
		Student.put(2, s2);
		Student.put(3, s3);
		Student.put(4, s4);
		Student.put(5, s3);
		
		for(Map.Entry m:Student.entrySet()) {
			eachValue=(List<String>) m.getValue();
			total=Integer.parseInt(eachValue.get(1));
		
		if(total>=80) {
			rank="First Rank";
		}else if(total >=60) {
			rank="Second Rank";
		}
		else {
			rank="Third rank";
		}
			
		if(total>temp) {
			temp=total;
			name=eachValue.get(0);
		}
		
			
		}

		System.out.println("The Name of The Student is : "+name+"\n"+"Marks Highest Is : "+total+"\n"+"The rank is::"+rank);
		


	}

}
