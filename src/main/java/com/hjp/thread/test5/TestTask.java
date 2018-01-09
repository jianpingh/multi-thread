package com.hjp.thread.test5;

import java.util.Date;
import java.util.Timer;

public class TestTask {
public static void main(String[] args) {
		
		//定时器
		Timer timer=new Timer();
		
		CustTimeTasker cust=new CustTimeTasker();
		
		//从当前时间开的，10秒后执行一次
		//timer.schedule(cust,1000*10);
		
		//从当前时间开的，3秒后执行  每10秒执行一次，循环执行
		//timer.schedule(cust,3000,1000*10);
		
		
		//从当前时间开的，执行一次
		//timer.schedule(cust, new Date());
		
		
		//从当前时间开的，   每10秒执行一次，循环执行
		timer.schedule(cust, new Date(), 1000*10);
	}
}
