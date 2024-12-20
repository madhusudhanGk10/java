import java.util.Scanner;
public class seres{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int m=sc.nextInt();
		int a[][]=new int[m][m];
		int b[][]=new int[m][m];
		System.out.println("enter the elements into the array ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
	System.out.print("[");
		int s=0;
		int t=m;
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				if(i==s)				
				System.out.print(a[i][j]);	
				if(j==t){
				for(int k=s+1;k<m;k++){
					System.out.print(a[k][j]);
		}}}}
System.out.print("]");
}
}