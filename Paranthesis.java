import java.util.Scanner;
public class Paranthesis{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++){
			System.out.print("(");
		}
		for(int i=0;i<a;i++){
			System.out.print(")");
		}
		int n=a-1;
		for(int i=0;i<a-1;i++){
			System.out.println();
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					System.out.print("(");
				}
				for(int l=0;l<n;l++){
					System.out.print(")");
				}
			
			for(int m=0;m<(a-n);m++){
			System.out.print(" ("+" )");
		}
		System.out.println();
		n--;
}
}
}}