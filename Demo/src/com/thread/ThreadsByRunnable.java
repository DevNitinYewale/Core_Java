package com.thread;

public class ThreadsByRunnable implements Runnable {
	int time;
	Thread thread;
	public ThreadsByRunnable(int time, String name) {
		this.time=time;
		thread=new Thread(this,name);
		thread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			System.out.println(thread.currentThread());
			
			try {
				thread.sleep(time);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}System.out.println(thread.getState());
	}

}
