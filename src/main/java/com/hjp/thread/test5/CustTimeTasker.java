package com.hjp.thread.test5;

import java.util.TimerTask;

public class CustTimeTasker  extends TimerTask{

	@Override
	public void run() {
		
		System.out.println("TimerTask，定时执行任务");
		
	}
}
