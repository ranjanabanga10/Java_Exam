package Exam;

import java.util.Map;
import java.util.TreeMap;

public class treeMapStudent {

	/*Write a java program to store 5 student information 
	 * in a treeMapNote: 
	 * student object has student name and student reg no
	 */
	public static void main(String[] args) 
	{
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(11,"Razia");
		tm.put(12,"Daisy");
		tm.put(13,"Mahi");
		tm.put(14,"Harry");
		tm.put(15,"Sandhu");
		
		for(Map.Entry m:tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
