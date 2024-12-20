import java.util.Scanner;
class Userinput
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String m=sc.next();
		int n=sc.nextInt();
		for(int i=0;i<m.length();i++){	
			for(int j=i+1;j<m.length();j++){	
				char a=m.charAt(i);
				char b=m.charAt(j);
				System.out.print(a);
				System.out.print(b);
			}
			System.out.println();			
		}
		
}
}