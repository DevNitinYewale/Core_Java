package thread;

public class FirstThread  extends Thread{
	int time;
	public FirstThread(int time) {
		this.time=time;
		start();
	}
	
	public void run() {
		super.run();
		
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread());
			
			try {
				sleep(time);
			}catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println();
				e.printStackTrace();
			}
		}
	}
}
