package logicBuilding;

public class AccessStaticVariables {
	int a;
	static int b;
	public static void add() {
		System.out.println(b);
		AccessStaticVariables ac=new AccessStaticVariables();
		System.out.println(ac.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessStaticVariables ac1;
		ac1=new AccessStaticVariables();
		ac1.add();
		add();
	}

}
