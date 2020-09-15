package Exam;

import java.util.ArrayList;

public class employeeObject {

	public static void main(String[] args) {
		
		ArrayList<String> emp=new ArrayList<String>();
		emp.add("Ranjana");
		emp.add("Asad");
		emp.add("Banga");
		emp.add("Banga");
		emp.add("Singh");
		
		for(int i=0;i<=emp.size();i++) {
		if(!emp.equals(i)) {
		emp.remove(i);
		}
	}
		System.out.println(emp);
		
	}

}
