import java.util.Scanner;
class Demo
{*+.
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[5];
		System.out.println( "enter the names of empolyes");
		for(int i=0;i<5;i++){		
			arr[i]=sc.next();
		}
		System.out.println( );
		for(int i=0;i<5;i++){		
			System.out.println( arr[i]);
		}
	}
}