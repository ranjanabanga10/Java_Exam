package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class vehicalParking {
	/*
	 * Write a java program to implement the fallowing Consider vehicle parking 
	 * application where each vehicle information which enters into the parking 
	 * location stored in 2 lists. at the end of each day these lists to be merged 
	 * into single list and one vehicle information which has highest parked hour 
	 * should be retrieved, where each vehicle information has vehicle number, 
	 * vehicle model, total duration parked in minutes.
	 */
	int vehical_No=0;
	String vehical_Model="";
	int totalHoursParkedInMin=0;
	public vehicalParking(int vehical_No,String vehical_Model, int totalHoursParkedInMin){
		this.vehical_No=vehical_No;
		this.vehical_Model=vehical_Model;
		this.totalHoursParkedInMin=totalHoursParkedInMin;
	}
	public static void main(String[] args) 
	{
		vehicalParking v1=new vehicalParking(111,"Nissan",60);
		vehicalParking v2=new vehicalParking(112,"Honda",20);
		vehicalParking v3=new vehicalParking(113,"Toyata",40);
		
		ArrayList<vehicalParking> vp=new ArrayList<vehicalParking>();
		vp.add(v1);
		vp.add(v2);
		vp.add(v3);
		
		Iterator itr=vp.iterator();
		while(itr.hasNext()) {
			vehicalParking vh=(vehicalParking)itr.next();
		
			System.out.println(vh.vehical_No+" "+vh.vehical_Model+" "+vh.totalHoursParkedInMin);
			
		}
		
		System.out.println("***************************************");
		
	}

}
