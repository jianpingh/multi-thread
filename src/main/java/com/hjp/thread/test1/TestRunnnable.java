package com.hjp.thread.test1;

public class TestRunnnable {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
					System.out.println("乌龟领先了，加油！");
				}
			}
		}).start();

		new Thread(new Runnable() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
					System.out.println("大象领先了，加油！");
				}
			}
		}).start();

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println("兔子领先了，别骄傲！");
		}
	}
}
