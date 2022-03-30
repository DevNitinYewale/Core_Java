package thread;

public class StopThread1 extends Thread{
	String str="";
	public StopThread1(String str) {
		this.str=str;
	}
	public void  run() {
		try {
			while(!Thread.interrupted()) {
				System.out.println(str);
				Thread.sleep(1000);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
