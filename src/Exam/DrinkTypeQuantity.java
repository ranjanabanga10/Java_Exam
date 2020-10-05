package Exam;

import java.util.*;


public class DrinkTypeQuantity {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("User enter drink type:: ");
		String userdrink=input.nextLine();
		System.out.println("User enter quantity:: ");
		int quantity=input.nextInt();

		Map<String,Integer> drinktypes=new HashMap();
		drinktypes.put("Coke", 20);
		drinktypes.put("Diet_Coke", 10);
		drinktypes.put("Pepsi", 30);
		drinktypes.put("Diet_Pepsi", 10);


		Set<Map.Entry<String, Integer>> values= drinktypes.entrySet();

		if(userdrink.equals(values)) {
			System.out.println("Drink should be served..");
			
		}else {
			System.out.println("Drink should not be served..");
		}
		
		for(Map.Entry<String, Integer> e:values) {
			
		
			
			System.out.println(e.getKey() +" : "+e.getValue());
			//e.setValue(2);
		}


		//	Set<String> keys=drinktypes.keySet();
		//	for(String i:keys) {
		//
		//		System.out.println(i+" : "+drinktypes.get(i));
		//	}
	}

}
