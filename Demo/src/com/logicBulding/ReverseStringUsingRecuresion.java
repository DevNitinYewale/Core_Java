package com.logicBulding;

public class ReverseStringUsingRecuresion {
	/*public static int fact(int n) {
		if(n==0)
			return 1;
		
		else 
			return (n*fact(n-1));	
	*/
		
	public static void fact(String s) {
		if((s==null) || s.length()<=1) {
			System.out.println(s);
		}
		else {
			System.out.print(s.charAt(s.length()-1));
			
			fact(s.substring(0,s.length()-1));
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fact("nrt"));
		fact("fyt");
	}

}
