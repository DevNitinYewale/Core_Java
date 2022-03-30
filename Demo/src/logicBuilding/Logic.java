package logicBuilding;

class def{
	
	int b=10;
//	public def(int b){
//		this.b=b;
//	}
}
public class Logic extends def {
	int b=25;
	int c=30;
	
	public static void main(String[] args) {
//		Logic l1=new Logic();
//		System.out.println(l1);
		def d=new Logic();
		Logic l=(Logic) new def();
		System.out.println(d.b+" ");
		System.out.println(l.b);
	}
	
}
