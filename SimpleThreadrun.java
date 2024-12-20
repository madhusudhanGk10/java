
import java.util.InputMismatchException;
import java.util.Scanner;
class thread2 implements Runnable{
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
			System.out.println("G.Madhusudhan");
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
public class SimpleThreadrun{
public static void main(String[] args) throws InterruptedException { 
	thread2 t1=new thread2();
	thread2 t2=new thread2();
	thread2 t3=new thread2();
	Thread t=new Thread(t1);
	Thread t11=new Thread(t2);
	Thread t22=new Thread(t3);
	t.setName("addition");
	t11.setName("printing");
	t22.setName("banking");
	t.start();
	t22.start();
	t11.start();
}
}