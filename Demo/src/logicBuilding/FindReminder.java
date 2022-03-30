package logicBuilding;

import java.util.Scanner;

public class FindReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>=1) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a>=1 && b<=1000) 
				System.out.println((a%b));
			else
				System.out.print("enter a number between 1 to 1000");
			t--;
		}
		
		sc.close();
	}

}