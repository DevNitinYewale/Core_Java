package constructor.example;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("Default Constructor1: ");
	}
	
	public ConstructorDemo(int x) {
		this();
		System.out.println("Parameterized onstructor:-1");
		System.out.println("X: "+x);
	}
	public ConstructorDemo(int x,int y) {
		this(10);
		System.out.println("parameterized constructor:-2");
		System.out.println("Addition: "+(x+y));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd=new ConstructorDemo(10,20);
	}

}
