import java.util.Scanner;
class area{
double r;
static double pi;
double ar;
static{
	pi=3.14;
}
void collection(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Entert the radious of circle ");
	r=sc.nextDouble();
}
void calculate(){
	ar=(pi*r*r);
	System.out.println(ar);
}
}
public class AreaCircle {
	public static void main(String[] args) {
		area a=new area();
		a.collection();
		a.calculate();
}
}