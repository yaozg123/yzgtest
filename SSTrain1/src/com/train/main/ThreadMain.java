package com.train.main;

import com.train.util.MyThread;

public class ThreadMain {

	public static void main(String[] args) {
		
		MyThread mThread = new MyThread();
		
		Thread a = new Thread(mThread, "A");
		Thread b = new Thread(mThread, "B");
		Thread c = new Thread(mThread, "C");
		Thread d = new Thread(mThread, "D");
		Thread e = new Thread(mThread, "E");
		Thread.currentThread().getName();
		System.out.println(c.currentThread().getName());
		a.start();
		//b.start();
		//c.start();
		//d.start();
		//e.start();
		//����ý��û�а���5���εݼ������ִ���������̰߳�ȫ����
		int i = 11;
		//System.out.println(--i);
	}
	
}
