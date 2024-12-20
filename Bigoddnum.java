import java.util.Scanner;
class Bigoddnum{
public static void main(String[] ags){
	Scanner sc=new Scanner(System.in);
	System.out.println( "enter the integer String");
	String str=sc.next();
	int a = Integer.parseInt(str); 
	if(a%2==1)
		System.out.println(a);
	else{
	int n=a;
	while(n>0){
		int x=n/10;
		if(x%2==1){
			System.out.println(x);
			break;
		}
		n=x;
	}
	}
}

}