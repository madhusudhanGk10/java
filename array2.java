import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][5];
		for(int i=0;i<3;i++){		
			for(int j=0;j<5;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println( );
		for(int i=0;i<3;i++){		
			for(int j=0;j<5;j++){
			if(j==0)
			System.out.println();
			System.out.print( arr[i][j]+" ");
			}
		}
	}
}