package com.hjp.thread.test3;

public class TestSynchronized {

	public static void main(String[] args) {
		
		BookingTicket2 ticket = new BookingTicket2();
		
		// 代理角色
		Thread thread1 = new Thread(ticket, "农民");
		Thread thread2 = new Thread(ticket, "工人");
		Thread thread3 = new Thread(ticket, "学生");
		thread1.start();
		thread2.start();
		thread3.start();

	}

}

class BookingTicket2 implements Runnable {

	private int num = 100;// 共100张票
	private boolean isCanBuy = true; //能否购买票

	@Override
	public void run() {
		while (isCanBuy) {
			Booking();
		}
	}

	public synchronized void Booking() {
		if (num <= 0) {
			isCanBuy = false;
			return;// 跳出循环，结束
		}

		try {
			Thread.sleep(500); // 模拟延时
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + "抢到了" + num--);
		
		/* 
		 * synchronized代码块 也可以
		String string="hello";
    	synchronized (string)
    	{   		
    		
    		 if (num<=0) {
    	            flag = false;
    	            return;//跳出循环，结束
    	        }
    	        
    	        try {
    	            Thread.sleep(500);  //模拟延时
    	        } catch (InterruptedException e) {
    	            e.printStackTrace();
    	        }   	        
    	        
    	        System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
    	    			
		}*/
	}
}
