import java.util.*;
class ThrowsException{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age:");
int num=sc.nextInt();
checkage(num);
}
static void checkage(int age) throws ArithmeticException{
if(age<18)
{
throw new ArithmeticException("You must be 18 or above 18 to vote");
}
else{
System.out.println("You are eligible to vote");
}
}
}