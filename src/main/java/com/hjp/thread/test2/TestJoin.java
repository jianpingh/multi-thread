package com.hjp.thread.test2;

public class TestJoin extends Thread {

	public TestJoin(String name) {
		super(name);
	}

	public void run() {

		for (int i = 0; i < 50; i++)
			System.out.println(getName() + i);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				TestJoin tempjt = new TestJoin("半路加入的线程");
				try {
					tempjt.start();
					tempjt.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println(Thread.currentThread().getName() + "" + i);
		}
	}
}
