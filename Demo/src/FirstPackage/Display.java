package FirstPackage;

public class Display {
	public static void main(String[] args) {
		int n=5,cnt=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(cnt+" ");
				cnt++;
			}
			System.out.println();
		}
	}
}
