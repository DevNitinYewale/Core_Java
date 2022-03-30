package abstraction;

public abstract class Shape {
	abstract void area(int x,int y);
	abstract void volume(int x,int y,int z);
	void show(String message) {
		System.out.println("I am calculating: "+message);
	}
}
