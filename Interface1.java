interface S {
void cal();
void disp();
}
class C implements S{
double pi=3.14;
double r=5,area;
public void cal(){
area=pi*r*r;
}
public void disp(){
System.out.println(area);
}
}
class Sq implements S{
double r=5,area;
public void cal(){
area=r*r;
}
public void disp(){
System.out.println(area);
}
}
class R implements S{
double l=5,b=6,area;
public void cal(){
area=l*b;
}
public void disp(){
System.out.println(area);
}
}
class Interface1{
	public static void main(String[] args){
		C c=new C();
		c.cal();
		c.disp();
		R r=new R();
		r.cal();
		r.disp();
		Sq s=new Sq();
		s.cal();
		s.disp();

}
}