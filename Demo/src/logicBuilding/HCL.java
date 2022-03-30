package logicBuilding;

public class HCL{
	//int x;
	public static void fun(int x) {
		if(x>9) {
			fun(x/9);
			System.out.println(x-1);
			fun(x/3);
		}
		else {
			System.out.println(x-2);
		}
	}
	
	public static void main(String[] args) {
/*		int  a=10,b=6,v=60,c=0;
		while(v>5) {
			a=a-v;
			c=(a+b)%10;
			while(c>10) {
				b=b+c;
			}
			v=v/2;
		}
		System.out.println(b+" "+c);
	*/
		HCL.fun(27);
		
	}
}

/*public class HCL {
	int fun(int a[], int n) {
		int x;
		if(n==1)
			return a[0];
		else 
			x=fun(a,n-1);
		if(x> a[n-1])
			return x;
		else
			return a[n-1];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HCL h1=new HCL();
		int a[]={12,10,30,50,100};
		int p=h1.fun(a, 5);
		System.out.println(p);
	}

}*/
