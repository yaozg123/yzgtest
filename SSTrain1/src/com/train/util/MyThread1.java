package com.train.util;

public class MyThread1 extends Thread {

	public MyThread1() {
		
	}
	
	int i = 5;
	public void run() {
		super.run();
		
		System.out.println("�ڲ� :" + Thread.currentThread().getName() + "==" + i--);
	}
	
}
