import java.util.Scanner;
import java.util.Scanner;
public class Pattren2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		int z=0;
		for(int c=0;c<2*a;c++){
			if(c%2==1){
				arr[z]=c;
				z++;
			}
		}
		for(int i=a;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print("# ");
			}
			int n=arr[i-1];
			for(int k=i;k<a;k++){
			   System.out.print(n+" ");
				n+=2;
		}
			System.out.println();
			
		}
		
}
}
