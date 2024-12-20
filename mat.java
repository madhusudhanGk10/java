import java.util.Scanner;
public class mat{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size ");
		int m=sc.nextInt();
		int a[][]=new int[m][m];
		System.out.println("enter the elements into the array ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				if(j==0)
				System.out.println();
				System.out.print(a[i][j]);
			}
		}

		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				if(a[i][j]==0){
					int k=i;
					for(int l=0;l<m;l++){
						//if(a[k][l]>0)
							a[k][l]=0;	
						}
					int o=j;
					for(int n=0;n<m;n++){
						//if(a[n][o]>1)
							a[n][o]=0;
					}
			}}
	}
System.out.println("\n");
	for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				if(j==0)
				System.out.println();
				System.out.print(a[i][j]);
			}
		}

	}

}
