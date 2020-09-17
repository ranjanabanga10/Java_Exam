package Exam;


public class linkedlistStack {
	Node head;
	
	class Node{
		int value;
		Node next;
	}
	
	
	linkedlistStack(){
		head=null;
	}
	
	//push: as value to the begining of the list
	
	public void push(int value) {
		
		Node extraHead=head;
		head = new Node();
		head.value=value;
		head.next=extraHead;
	}

	public int pop() {
		if(head==null) {
			System.out.println("Stack is empty");
		}
		int value=head.value;
		head=head.next;
		return value;
	}
	public static void main(String[] args) {
		linkedlistStack lls=new linkedlistStack();
		//System.out.println(lls.pop());
		
		lls.push(10);
		lls.push(20);
		lls.push(30);
		lls.push(40);
		lls.push(90);
		
		System.out.println("element removed or popped from stack::"+lls.pop());
		System.out.println("element removed or popped from stack::"+lls.pop());
		
		lls.push(45);
		System.out.println("element removed or popped from stack::"+lls.pop());

	}

}
