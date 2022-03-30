package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		
		ArrayList<Integer> l2=new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		l2.add(40);
		l2.add(50);
		l2.add(60);
		System.out.println(l1);
		
		l1.addAll(l2);
		Collections.sort(l1);
		
		System.out.println("running forEach loop:");
		for(int a: l1) {
			System.out.print(a+" ");
		}
		System.out.println("\nrunning for loop: ");
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i)+" ");
		}
		System.out.println("\nrunning Iterator");
		Iterator<Integer> itr=l1.listIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}
