package com.train.main;

import com.train.bean.Student;
import com.train.bean.Teacher;
import com.train.util.MyThread1;

public class ThreadMain1 {

	public static void main(String[] args) {
		
		MyThread1 myThread1 = new MyThread1();
		
		Thread thread1 = new Thread(myThread1);
		Thread thread2 = new Thread(myThread1);
		Thread thread3 = new Thread(myThread1);
		Thread thread4 = new Thread(myThread1);
		Thread thread5 = new Thread(myThread1);
		
//		thread1.setName("线程1");
//		thread1.start();
//		
//		thread2.setName("线程2");
//		thread2.start();
//		
//		thread3.setName("线程3");
//		thread3.start();
//		
//		thread4.setName("线程4");
//		thread4.start();
//		
//		thread5.setName("线程5");
//		thread5.start();
		
		//System.out.println(thread1.isAlive());
		
		Teacher teacher = new Teacher();
		Student student = new Student();
		student.start();
		
	}
	
}
