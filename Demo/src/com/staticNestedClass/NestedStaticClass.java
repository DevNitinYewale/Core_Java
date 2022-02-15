package com.staticNestedClass;

public class NestedStaticClass {
	void outerDisplay() {
		System.out.println("I am outer Display method.......!");
	}
	
	static class InnerStatic{
			void innerDisplay() {
				System.out.println("I am innerDisplay from Inner Static Class: ");
				NestedStaticClass obj=new NestedStaticClass();
				obj.outerDisplay();
				
			}
	}
	
	void outerDisplay2() {
		System.out.println("I am outer Display2 metho.......!");
		InnerStatic obj2=new InnerStatic();
		obj2.innerDisplay();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedStaticClass.InnerStatic obj3=new NestedStaticClass.InnerStatic();
		obj3.innerDisplay();
	/*	NestedStaticClass ns=new NestedStaticClass();
		ns.outerDisplay2();*/
	

	}

}
