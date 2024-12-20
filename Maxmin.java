import java.util.Scanner;
public class Maxmin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int a[]=new int[m];
		int min=0;
		int max=0;
		int sum=0;
		System.out.println("entert the elements into the array ");
		for(int i=0;i<=m;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=m;i++) {
			if(a[i]<a[i+1]) {
				min=a[i];
			}
			if(a[i]>a[i+1])
				max=a[i];
			sum+=a[i];
				
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}

}
