package abstraction;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		c1.show("Circle");
		c1.area(5, 3);
		
		Sphare s1=new Sphare();
		s1.show("Sphare");
		s1.volume(2, 2, 2);
	}

}
