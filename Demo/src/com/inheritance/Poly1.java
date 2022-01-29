package com.inheritance;

public class Poly1 {
	private String name;
	private String cource;
	private double avg;
	public Poly1(String name,String cource) {
		this.name=name;
		this.cource=cource;
	}
	
	public void getData(int marks1,int marks2) {
		double total=marks1+marks2;
		avg=(total/200)*100;
		
	}
	public void display(int roll) {
		System.out.println("Roll.No: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Cource: "+cource);
		System.out.println("Percentage: "+avg);
	}
}
