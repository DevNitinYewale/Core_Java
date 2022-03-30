package logicBuilding;



import java.util.Scanner;

public class FindDuplicateElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  array elements: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			cnt=0;
			for(int j=i-1;j>=0;j--) {
				if(arr[i]==arr[j]) {
					cnt++;
					//System.out.println("equals: "+arr[j]+" J "+j+" i "+i+" cnt: "+cnt);
				}
			}
			if(cnt==0) {
				//System.out.println("In if ");
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
					}
					if(count>1)
					System.out.println(arr[i]+" find "+count+" times");
			}
			
			
		}
		System.out.println("end");
	}
}

/*
difference bet string builder and string buffer
what is string in java it is a data type
what is string pool in java
how many objects created for following code
what is shallow comparison deep
shallow ==  The == returns true, if the variable reference points to the same object in memory. This is a “shallow comparison” 
deep ===
what are the way to compare string'
use of subString()
how to check string is empty 
what is format method in java string
can convert string to int and vice versa
given to number as a string then product it number can be negative 
given a string and find the longest substring without repeating
*/