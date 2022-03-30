package constructor.example;

public class Getter_Setter_Demo_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		Getter_Setter_Demo obj=new Getter_Setter_Demo();
		obj.setNumber(123);
		obj.setName("EduBridge");
		
		System.out.println(obj.getNumber());
		System.out.println(obj.getName());
		
		//2
		Getter_Setter_Demo obj1=new Getter_Setter_Demo();
		obj1.setName("ABC");
		obj1.setNumber(456);
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getNumber());
	}

}
