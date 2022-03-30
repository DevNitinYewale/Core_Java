package arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,45,5,14,45,10};
		int i,j;
		for(i=1;i<arr.length;i++) {
			int temp=arr[i];
			for(j=i-1;j>=0 && temp<=arr[j];j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}