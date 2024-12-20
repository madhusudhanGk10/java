import java.util.Scanner;
public class pattren1{
	public static void main(String[] args) {
		int a=5;
		for(int i=a;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print("# ");
			}
			int n=i;
			for(int k=i;k<a;k++){
			   System.out.print(n+" ");
				n++;
		}
			System.out.println();
			
		}
		
}
}
