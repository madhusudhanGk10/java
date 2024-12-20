import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String arr[][][]=new String[2][2][2];
		for(int i=0;i<2;i++){		
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++){
				arr[i][j][k]=sc.next();
				}
			}
		}
		System.out.println( );
		for(int i=0;i<2;i++){		
			for(int j=0;j<2;j++){
			for(int k=0;k<2;k++){
			if(k==0)
			System.out.println();
			System.out.print( arr[i][j][k]+" ");
			}
                   }
		}
	}
}