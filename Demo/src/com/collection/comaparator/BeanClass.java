package com.collection.comaparator;

import java.util.Comparator;

public class BeanClass implements Comparator {

		
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer n1=(Integer)o1;
		Integer n2=(Integer)o2;
		if(n1<n2)
			return 1;
		else if(n1>n2)
			return -1;
		else 
			return 0; 
		
		
		
	}
	
}
