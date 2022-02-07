package com.thread;

public class StopThread2 extends Thread{
	String str="";
	public StopThread2(String str) {
		this.str=str;
	}
	public void run() {
		try {
			while(true) {
				System.out.println(str);
				Thread.sleep(1000);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
