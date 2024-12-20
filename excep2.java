
import java.util.InputMismatchException;
import java.util.Scanner;
public class excep2 {
	public static void main(String[] ags){
	try{
		Scanner sc=new Scanner(System.in);
		System.out.println( "enter the integer ");
		int i=sc.nextInt();
		int arr[]=new int[i];
		arr[i+1]=4;
		arr[1]=0;
		arr[3]=10;
		int s=arr[3]/arr[1];
		System.out.println(s);
	}
	catch(InputMismatchException e1){
		System.out.println("input is not valid");
	}
	catch(ArithmeticException e2){
		System.out.println("arthematic exception accured");
	}
	catch(ArrayIndexOutOfBoundsException e4){
		System.out.println("input is not valid");
	}
	catch(Exception e){
		System.out.println("general exeption block");
	}
	finally{
			System.out.println("code executed sucussfully");
	}
}
}

