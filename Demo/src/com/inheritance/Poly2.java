package com.inheritance;

public class Poly2 extends Poly1 {
	private String contact;
	
	public Poly2(String name, String cource, String contact) {
		super(name, cource);
		this.contact=contact;
	
	}
	
	public void getData(int marks1,int marks2) {
		super.getData(marks1, marks2);
		
	}
	
	public void  display(int roll) {
		super.display(roll);
		System.out.println("Contact.No: "+contact);
	}
	
}
