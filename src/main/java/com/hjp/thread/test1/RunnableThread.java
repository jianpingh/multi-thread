package com.hjp.thread.test1;

public class RunnableThread {

	public static void main(String[] args) {
	
		RunnableThread1 thred1=new RunnableThread1();
		Thread thread =new Thread(thred1);
		thread.start();
		
		while (true) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("兔子领先了，别骄傲！");
			
		}

	}

}

class RunnableThread1 implements Runnable{
	
	@Override
	public void run(){
		while (true) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("乌龟领先了，加油！");
			
		}
	}
}

class RunnableThread2 implements Runnable{
	
	@Override
	public void run(){
		while (true) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("大象领先了，加油！");
			
		}
	}
}
