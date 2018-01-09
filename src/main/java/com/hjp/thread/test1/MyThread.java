package com.hjp.thread.test1;

public class MyThread {

	public static void main(String[] args){
		
		Thread1 thread1=new Thread1();
		thread1.start();
		
		Thread2 thread2=new Thread2();
		thread2.start();
		
		while(true){
			System.out.println(Thread.currentThread().getName());
			System.out.println("兔子领先了，别骄傲！");
		}	
	}
}

class Thread1 extends Thread{
	
	@Override
	public void run(){
		while(true){
			System.out.println(this.getName());
			System.out.println("乌龟领先了，加油！");
		}
	}
	
}

class Thread2 extends Thread{
	
	@Override
	public void run(){
		while(true){
			System.out.println(this.getName());
			System.out.println("大象领先了，加油！");
		}
	}
	
}