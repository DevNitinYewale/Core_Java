package com.collection.comaparator;

import java.util.TreeSet;

public class MainComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet(new BeanClass());
		ts.add(1);
		ts.add(10);
		ts.add(5);
		ts.add(0);
		System.out.print(ts);
	}

}
