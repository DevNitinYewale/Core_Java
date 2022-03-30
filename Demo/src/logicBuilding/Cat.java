package logicBuilding;

interface Animal2{
	void speak();
}
public class Cat implements Animal2 {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("meow");
	}
	public static void main(String[] args) {
		new Cat().speak();
	}
}
