package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "nitin");
		map.put(4, "abc");
		map.put(0, "nit");
		map.put(6, "in");
		System.out.println(map.get(4));
		System.out.println("Map elements: ");
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" :: "+entry.getValue());
		}
	}

}
