import java.util.InputMismatchException;
import java.util.Scanner;
class thread2 extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("addition")) {
			addition();
		}
		else if(Thread.currentThread().getName().equals("printing")) {
			printing();
		}
		else {
			banking();
		}
		
	}
	void addition() {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Task 1:addition oparation started");
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("result is: "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("not divisible by zero");
		}
		catch(InputMismatchException e1) {
			System.out.println("give correct input");
		}
	}
	void printing(){
		try {
		for(int i=0;i<5;i++) {
			System.out.println("L.Sreenivasulu");
			Thread.sleep(2000);
		}
		}
		catch(InputMismatchException e1) {
			System.out.println("give correct input");
		}
		catch(InterruptedException e2) {
			System.out.println(e2);
		}
	}
	void banking() {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Task 3:Banking oparation started");
		System.out.println("enter the account number");
	    int m=sc.nextInt();
		System.out.println("enter the pin code");
		int n=sc.nextInt();
		System.out.println("account details recorded");
		System.out.println("Task 3:banking oparation completed");
		}
		catch(InputMismatchException e1) {
			System.out.println("give correct input");
		}
	}
}
public class simpleThread{
public static void main(String[] args) throws InterruptedException {
	thread2 t1=new thread2();
	thread2 t2=new thread2();
	thread2 t3=new thread2();
	t1.setName("addition");
	t2.setName("printing");
	t3.setName("banking");
	t1.start();
	t2.start();
	t3.start();
}
}