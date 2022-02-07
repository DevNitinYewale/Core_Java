package com.thread;

public class BackwordFibbonacciSeries extends Thread {
	int msg;
	public BackwordFibbonacciSeries(int msg) {
		this.msg=msg;
	}
	public void run() {
		try {
			if(msg>0) {
				int arr[]=new int[msg];
				arr[0]=0;
				arr[1]=1;
				for(int i=2;i<msg;i++) {
					arr[i] = arr[i-2] + arr[i-1];
				}
				System.out.println();
				for(int i=msg-1;i>=0;i--) {
					System.out.print(arr[i]+" ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
