package thread;

class M1 extends Thread{
	SynchronizedThreadEx st;
	M1(SynchronizedThreadEx st){
		this.st=st;
		start();
	}
	public void run() {
		st.deposit(1000);
	}
}

class M2 extends Thread{
	SynchronizedThreadEx st;
	M2(SynchronizedThreadEx st){
		this.st=st;
		start();
	}
	public void run() {
		st.deposit(100);
	}
}

public class SynchronizedThreadEx {
	int bal=1000;
	
synchronized void deposit(int amt) {
		// TODO Auto-generated method stub
		int temp=bal;
		temp=temp+amt;
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		bal=temp;
		System.out.println("Balance is: "+bal);
	}
	public static void main(String[] args) {
		SynchronizedThreadEx st1=new SynchronizedThreadEx();
		System.out.println(st1);
		
		new M1(st1);
		new M2(st1);
	}
}
