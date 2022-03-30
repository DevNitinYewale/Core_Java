package thread;

public class ThreadRunnableEx1 implements Runnable {
	int time;
	Thread thread;
	public ThreadRunnableEx1(int time) {
		this.time=time;
		thread=new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
		System.out.println("Thread Info.: "+thread.currentThread());
		System.out.println("Thread Name: "+thread.getName());
		System.out.println("Thread Priority: "+thread.getPriority());
		System.out.println("Alive: "+thread.isAlive());
		try {
			thread.sleep(time);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		thread.setName("Nitin");
		thread.setPriority(10);
		
	}
	}

}
