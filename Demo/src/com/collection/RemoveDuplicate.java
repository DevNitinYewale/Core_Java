package com.collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create integer type list 
		List<Integer> l1=new ArrayList<>();
		//add elements in the list
		l1.add(12);
		l1.add(15);
		l1.add(12);
		l1.add(15);
		l1.add(16);
		
		//create another list which is integer type
		List<Integer> l2=new ArrayList<>();
		
		//using forEach loop iterate all elements one by one
		for(int a:l1) {
			//check a value it is present or not in l2
			//contains method return boolean values
			if(l2.contains(a)==false) {//if return false then add a values in list l2
				l2.add(a);
			}
		}
		System.out.println(l2);
		
	}

}
