package collection;

import java.util.HashMap;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java is a robust. java is multithreaded";
		HashMap<String , Integer> hm=new HashMap<>();
		String str2[]=str.split(" ");
		for(String temp:str2) {
			if(hm.get(temp)==null)
				hm.put(temp, 1);
			else
				hm.put(temp,hm.get(temp)+1);
		}
		System.out.println(hm);
	}

}
