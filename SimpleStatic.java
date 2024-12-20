import java.util.Scanner;
class farmer{
double p;
static double r;
double t;
double si;
static{
	r=2.5;
}
void collection(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Entert the principle amount ");
	p=sc.nextDouble();
	System.out.println("Entert the principle time ");
	t=sc.nextDouble();

}
void calculate(){
	si=(p*t*r)/100;
	System.out.println(si);
}
}
public class SimpleStatic {
	public static void main(String[] args) {
		farmer f=new farmer();
		f.collection();
		f.calculate();
}
}