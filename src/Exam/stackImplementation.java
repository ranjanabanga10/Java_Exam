package Exam;

public class stackImplementation {

	int size;
	int arr[];
	int top;
	
	stackImplementation(int size){
		this.size=size;
		this.arr=new int[size];
		this.top= -1;
	}
	//time complexity:o(1)
	public void push(int element) {
		if(!isFull()) {
			top++;
			arr[top]=element;
			System.out.println("Pushed element : "+element);

		}
		else {
			System.out.println("Stack is full");

		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int returnedTop=top;
			top--;
			System.out.println("Popped element is:  "+arr[returnedTop]);
			return arr[returnedTop];
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	public int peek() {
		if(!this.isEmpty()) {
			return arr[top];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
		
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (size-1==top);
	}
	
	
	public static void main(String[] args) {
		stackImplementation sm=new stackImplementation(10);
		sm.pop();
		System.out.println("----------------------");
		sm.push(100);
		sm.push(200);
		sm.push(300);
		sm.push(400);
		
		System.out.println("----------------------");
		System.out.println(sm.peek());
		sm.pop();
		sm.pop();
		
		System.out.println("----------------------");
		
		System.out.println(sm.isEmpty());
		System.out.println(sm.isFull());
	}

}
