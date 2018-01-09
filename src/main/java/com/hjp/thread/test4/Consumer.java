package com.hjp.thread.test4;

//消费者线程
public class Consumer extends Thread{
private SharedData s;
	
    Consumer(SharedData s){
		this.s = s;		
	}
	
	public void run(){
		
		char ch;
		
		do {			
			try	{
				Thread.sleep((int) (Math.random() * 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ch = s.getShareChar(); // 从仓库中取出产品
			
		} while (ch != 'D');
		
		
	}
}
