import java.util.Scanner;
class ElIfElsecon
{
	public static void main(String[] args) 
	{    
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		if(i<40){
			System.out.println("GRADE-D");
		}
		else if(40<i && i<= 60){
			System.out.println("GRADE-C");
		}
		else if(60 <i && i<= 80){
			System.out.println("GRADE-B");
		}
		else if(80< i && i<=100){
			System.out.println("GRADE-A");
		}

	}
}