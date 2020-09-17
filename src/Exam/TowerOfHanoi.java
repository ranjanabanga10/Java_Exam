package Exam;

public class TowerOfHanoi {
	/*
	 * function(3,fromA, toC, viaB){
	 * if(RingsCount==1) return;
	 * function(3-1,fromA,toB, auxC)
	 * print(from A to C);
	 * function(3-1,fromB,toC, auxA)
	 * }
	 */
	
	int numofRings;
	public TowerOfHanoi(int i) {
		this.numofRings=i;
		getSot(numofRings, "A","C","B");
	}
	
	private void getSot(int numOfRings, String A, String C, String B) {
		if(numofRings==1) {
			System.out.println("Move from tower "+A+" to tower  "+C);
			return;
		}
		getSot(numOfRings-1, A, B, C);
		System.out.println("Move from tower "+A+" to tower  "+C);
		getSot(numOfRings-1, B, C, A);
	}

	public static void main(String[] args) {
		TowerOfHanoi th= new TowerOfHanoi(3);
	}

}
