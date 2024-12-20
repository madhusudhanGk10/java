import java.util.*;
public class excthrow {

	public static void main(String[] args) 
	{
			try{
				ShowException(); 
			}
			catch(ArithmeticException e) 
			{
				System.out.println("Exception from different function");
			} 
	}

			static void ShowException()
			{
				try{
					Scanner sc=new Scanner(System.in);
					System.out.println("Division Operation");
					System.out.println("Enter the numerator: ");
					int num=sc.nextInt();//critical Statement 
					System.out.println("Enter the denominator: "); 
					int deno=sc.nextInt();//critical Statement
					int res=num/deno;//critical Statement
					System.out.println(res);
				}
				catch(ArithmeticException e){
					throw e;
				}


}
}
