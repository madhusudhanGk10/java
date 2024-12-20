import java.util.Scanner;
class Information{
String name;
String email;
String password;
int age;
String phone;
void collect(){
	Scanner sc=new Scanner(System.in);
	int ch=1;
	while(ch==1){
	System.out.println("Enter the name");
	name=sc.next();
	System.out.println("Enter the email");
	email=sc.next();
	System.out.println("Enter the password");
	password=sc.next();
	System.out.println("Enter the age");
	age=sc.nextInt();
	System.out.println("Enter the phone");
	phone=sc.next();
	System.out.println("Name :"+name +"\n"+"email"+email +"\n"+"password : "+password+"\n"+"Age:"+age+"\n"+"phone number:"+phone);
	System.out.println("enter 1 for next entry if not 0");
	ch=sc.nextInt();
	}
}
}

public class intro {
	public static void main(String[] args) {
		info a=new info();
		a.collect();
}
}