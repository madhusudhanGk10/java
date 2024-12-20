import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of organization:");
		int m=sc.nextInt();
		System.out.println("enter the no.of companies:");
		int n=sc.nextInt();
		String arr[][][]=new String[m][n][];
		for(int i=0;i<arr.length;i++){	
			for(int j=0;j<arr[i].length;j++){
				System.out.println("enter the no.of empolyees in company:"+(j+1));
				arr[i][j]=new String[sc.nextInt()];		
		}
	}
		for(int i=0;i<arr.length;i++){	
				System.out.println("inside the  organization no:"+(i+1));
			for(int j=0;j<arr[i].length;j++){
				System.out.println("inside the  company no:"+(j+1));
			for(int k=0;j<arr[i][j].length;j++){
				System.out.println("enter the name of the em ployee no:"+(k+1));
				arr[i][j][k]=sc.next();

			}
                   }
	}
		System.out.println( );
		for(int i=0;i<m;i++){	
			System.out.println("organization no:"+(i+1));	
			for(int j=0;j<arr[i].length;j++){
			System.out.println(" company no:"+(j+1));
			for(int k=0;j<arr[i][j].length;j++){n
			if(j==0)
			System.out.println();
			System.out.print( arr[i][j][k]+" ");
			}
			System.out.println();
		}
		}
	}
}