package logicBuilding;

import java.util.Scanner;

public class FactorialOfLargestElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("how many number you enter in array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" numbers:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Maximum number: "+max);
		int fact=1;
		for(int i=1;i<=max;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+max+" is:= "+fact);
		
		sc.close();
	}

}
