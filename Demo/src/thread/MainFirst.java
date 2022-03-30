package thread;

public class MainFirst {
	public static void main(String[] args) {
		new FirstThread(1000);
		new FirstThread(2000);
		new FirstThread(100);
		new FirstThread(1000);
		
	}
}
