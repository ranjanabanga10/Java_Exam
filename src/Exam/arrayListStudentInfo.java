package Exam;

import java.util.ArrayList;

public class arrayListStudentInfo {

	public static void main(String[] args) {
		ArrayList<String> studentInfo =new ArrayList<String>();
		
		studentInfo.add("AAA");
		studentInfo.add("BBB");
		studentInfo.add("CCC");
		studentInfo.add("DDD");
		studentInfo.add("EEE");
		studentInfo.add("FFF");
//		for(int i=0;i<=studentInfo.size();i++) {
//			if(studentInfo.size()==4) {
			studentInfo.remove(5);
//			}
//		}
		System.out.println("Student information is:::"+studentInfo);
	}

}
