package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		/*
		 * create student type of arrayList
		 * */
		List<Students> list1=new ArrayList<Students>();
		/*
		 * add student information in array list
		 * */
		list1.add(new Students(2015,"Abc","CS"));
		list1.add(new Students(2011,"Def","BE"));
		list1.add(new Students(2019,"Gft","IT"));
		list1.add(new Students(2020,"DEW","CS"));
		list1.add(new Students(2022,"Abc","ME"));
		list1.add(new Students(2018,"Abc","CS"));

		/*
		 * sort data by student admission date
		 * */
		Collections.sort(list1);
		
		/*
		 * print all students record in ascending order of its admission date
		 * */
		for(Students stud: list1) {
			System.out.print("Addmission Date: "+stud.getDate());
			System.out.print("	Student Name: "+stud.getName());
			System.out.print("  Student Major: "+stud.getMajor());
			System.out.println();
		}
	
	}
}
