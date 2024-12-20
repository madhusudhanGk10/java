import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of companies:");
		int m=sc.nextInt();
		String arr[][]=new String[m][];
		for(int i=0;i<m;i++){		
				System.out.println("enter the no.of empolyees in company:"+(i+1));
				arr[i]=new String[sc.nextInt()];		
		}
		for(int i=0;i<arr.length;i++){	
				System.out.println("inside the  company no:"+(i+1));
			for(int j=0;j<arr[i].length;j++){
				System.out.println("enter the name of the em ployee no:"+(j+1));
				arr[i][j]=sc.next();
			}
                   }
		System.out.println( );
		for(int i=0;i<m;i++){	
			System.out.println("employes in the  company no:"+(i+1));	
			for(int j=0;j<arr[i].length;j++){
			if(j==0)
			System.out.println();
			System.out.print( arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}