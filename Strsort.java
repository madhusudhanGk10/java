import java.util.Scanner;
class Strsort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String m=sc.next();
		String a=" ";
		for(int i=0;i<m.length();i++){	
				for(int j=i+1 ;j<m.length();j++){
					if(m.charAt(i)==m.charAt(j))
						System.out.print(m.charAt(i));
		}
			System.out.print(m.charAt(i));
		}

}}