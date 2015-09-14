package com.psl.thread;

public class ThreadDemo implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (Thread.currentThread().getName().equals("MyOne")) {
				System.out.println(Thread.currentThread().getName());
			} else {
				System.out.println(Thread.currentThread().getName());
			}
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {

		ThreadDemo objDemo = new ThreadDemo();

		Thread t1 = new Thread(objDemo, "ThreadOne");
		Thread t2 = new Thread(objDemo, "ThreadTwo");

		t1.setName("MyOne");
		t2.setName("My2");
		
		t1.start();
		t2.start();

	}
}
