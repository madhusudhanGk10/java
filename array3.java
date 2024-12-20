import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String arr[][]=new String[3][3];
		for(int i=0;i<3;i++){		
			for(int j=0;j<3;j++){
				arr[i][j]=sc.next();
			}
		}
		System.out.println( );
		for(int i=0;i<3;i++){		
			for(int j=0;j<3;j++){
			if(j==0)
			System.out.println();
			System.out.print( arr[i][j]+" ");
			}
		}
	}
}