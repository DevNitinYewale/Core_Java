package thread;

public class ForwardFibonacciSeries extends Thread {
	int msg;
	public ForwardFibonacciSeries(int msg) {
		this.msg=msg;
	}
	public void run() {
		try {
			int first=0,last=1,sum=0;
			int p=msg;
			if(msg>0) {
				System.out.println("Forward Direction: ");
				while(msg>0) {
					System.out.print(first+" ");
					sum=first+last;
					first=last;
					last=sum;
					//System.out.print(sum+" ");
					msg--;
				}
				System.out.println("\nBackword Direction: ");
				int arr[]=new int[p];
				arr[0]=0;
				arr[1]=1;
				for(int i=2;i<p;i++) {
					arr[i] = arr[i-2] + arr[i-1];
				}
				for(int i=p-1;i>=0;i--) {
					System.out.print(arr[i]+" ");
				}
				
			}
			else if(msg==0) {
				System.out.println("0");
			}
			else {
				System.out.println("Number is negative");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
}
