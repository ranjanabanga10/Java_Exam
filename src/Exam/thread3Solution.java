package Exam;

class thread1 implements Runnable
{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread 1 ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class thread2 implements Runnable
{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread 2 ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class thread3 implements Runnable
{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread 3 ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class thread3Solution {
	

	public static void main(String[] args) {
		Runnable obj1=new thread1();
		Runnable obj2=new thread2();
		Runnable obj3=new thread3();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
	}

}
