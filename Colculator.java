import java.util.Scanner;
class Colculator
{
	public static void main(String[] args) 
	{    
		Scanner sc = new Scanner(System.in);
		int a=1;
		while(a==1){
		System.out.println("1.Addition" +"\n "+"2.Sustraction" +"\n "+"3.Multiplication"+" \n "+"4.division" +"\n"+ "5.exit");
		int i=sc.nextInt();
		System.out.println("enter the first number:");
		int x= sc.nextInt();
		System.out.println("enter the second number:");
		int y= sc.nextInt();
		switch(i){
		case 1:
			System.out.println(x+y);
			break;
		case 2:
			System.out.println(x-y);
			break;
		case 3:
			System.out.println(x*y);
			break;
		case 4:
			if(y==0){
			      System.out.println("zero error enter another number");
			}
			else{
				System.out.println(x/y);
			}
			break;
		case 5:
			a--;
		default:
			System.out.println("enter the number between 1 to 5");

		}
         }

	}
}