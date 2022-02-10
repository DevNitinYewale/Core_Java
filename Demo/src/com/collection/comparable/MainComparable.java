package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bean_Class bean1=new Bean_Class("red","zara", 100);
		Bean_Class bean2=new Bean_Class("blue","abc", 60.12);
		Bean_Class bean3=new Bean_Class("orange","def", 999.25);
		ArrayList<Bean_Class> al=new ArrayList<Bean_Class>();
		al.add(bean1);
		al.add(bean2);
		al.add(bean3);
		Collections.sort(al);
		for(Bean_Class obj: al) {
			System.out.println("Brand:: "+obj.getBrand());
			System.out.println("Price:: "+obj.getPrice());
			System.out.println("Color:: "+obj.getColor());
			System.out.println(" "+obj);
		}
	}

}
