package logicBuilding;

import java.util.Scanner;

public class Fractional {
	
	public void fractionSum(int n) {
		
		double denominator=2,sum=0;
		/*
		 * outer for loop
		 * */
		for(int i=1;i<=n;i++)
		{
			//declare power=1
			double power=1;
			
			/*find power of denominator and store it in power 
			 * */
			for(int j=1;j<=i;j++)
			{
				power=denominator*power;
			}
			
			/*
			 * increase value of denominator by 2 because in series denominator increase by 2 ex. 1/2^1 + 1/4^2 + 1/6^3 ...
			 * */
			denominator=denominator+2;
			
			/*calculate and store sum in sum variable*/
			
			sum+=1/power;
			//System.out.println(sum);
			
		}
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*create instance of Fractional Class*/
		
		Fractional f1=new Fractional();
		
		/*call fractionSum method and pass it one int value*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter n value: ");
		int n=sc.nextInt();
		
		f1.fractionSum(n);
		
	}
}
