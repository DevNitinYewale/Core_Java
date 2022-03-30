package logicBuilding;
import java.util.*;
public class CrossStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number,i,j;
		System.out.print("Enter a number: ");
		number=sc.nextInt();
		
		for(i=0;i<number;i++) {
			for( j=0;j<number;j++) {
				if(i==j || i+j==number-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	
	}

}
