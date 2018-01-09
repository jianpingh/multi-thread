package com.hjp.thread.test4;

public class TestProducerConsumer {

	public static void main(String[] args) {
		
		// 共享同一个共享资源
		SharedData s = new SharedData();

		// 生产者线程
		Producer producer = new Producer(s);
		producer.start();

		// 消费者线程
		Consumer consumer = new Consumer(s);
		consumer.start();
	}
}
