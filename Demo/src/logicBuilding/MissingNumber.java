package logicBuilding;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,3,8,7,6};
		int first,actual=0,n;
		n=arr.length+1;
		first=n*(n+1)/2;
		
		for(int i=0;i<n-1;i++) {
			actual+=arr[i];
		}
		int miss=first-actual;
		System.out.println("missing number: "+miss);
		
	}

}
