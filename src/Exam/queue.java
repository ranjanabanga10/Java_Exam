package Exam;

class queueDemo{
	int queue[]=new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		if(!isFull())
		{
		queue[rear]=data;
		rear=(rear+1)%5;
		size++;
		}
		else
		{
			System.out.println("Queue is full");
		}
	}
	
	public int deQueue() {
		int data=queue[front];
		if(!isEmpty())
		{
		front=(front+1)%5;
		size--;
		}
		else
		{
			System.out.println("Queue is empty");

		}
		return data;
	}
	
	public void show() {
		System.out.print("Elements are::  ");
		for(int i=0; i<size;i++) {
			System.out.print(queue[(front+i)%5]+"  ");
		}
		System.out.println();
		for(int n:queue) {
			System.out.print(n+" ");

		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return getSize()==0;
	}
	public boolean isFull() {
		return getSize()==5;
	}
}

public class queue {
	
	public static void main(String[] args) {
		queueDemo q=new queueDemo();
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(12);
		
		q.deQueue();
		q.deQueue();
		
		q.enQueue(33);
		//q.enQueue(44);
		System.out.println();
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());


		
		q.show();
		
		System.out.println("Size of queue::"+q.getSize());
	}

}
