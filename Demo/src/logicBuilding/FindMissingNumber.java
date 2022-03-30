package logicBuilding;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {2,3,1,0,5};
		
		for(int i=0;i<arr1.length;i++) {
			int cnt=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j])
					cnt++;
			}
			if(cnt==0) {
				System.out.println(arr1[i]);
			}
		}
		
	}

}
