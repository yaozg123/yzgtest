package com.train.util;

public class MyThread implements Runnable {

	private int count = 5;
	
	public void  run() {
		count --; 
		synchronized (this) {
			
			System.out.println("countµ√÷µ£∫ " + count);
		}

	}

}
