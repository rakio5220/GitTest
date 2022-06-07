package com.ezen.ex06;

class Counter {
	int count = 0;
	
 synchronized public void increment() { count++;}
	
 synchronized public void decrement() { count--;}
	
	public int getcount() { return count ; }

	
}

public class MakeThreadMulti {

	public static Counter cnt = new Counter();
	
	public static void main(String[] args) throws Exception {
		
		Runnable task1 = () -> {
			for(int i=0; i <100; i++)
				cnt.increment();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		};
		
		Runnable task2 = () -> {
			for(int i=0; i <100; i++)
				cnt.decrement();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(cnt.getcount());
	
	}
}
		


