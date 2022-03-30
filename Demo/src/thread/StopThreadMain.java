package thread;

public class StopThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopThread1 st1=new StopThread1("Thread1");
		StopThread1 st2=new StopThread1("Thread1");
		st1.start();
		st2.start();
	}

}
