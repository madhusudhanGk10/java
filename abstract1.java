abstract class Data{
abstract void collect(int x,int y);

abstract void calculate();

}
class circleA extends Data{
int r;
double p;
@Override
 void collect(int x,int y){
 r=x;
p=y;
}
@Override
void calculate(){
 System.out.println(p*r*r);
}
}
class triangleA extends Data{
int l;
int b;
int h;
@Override
 void collect(int x,int y){
l=x;
b=y;
h=4;
}
@Override
void calculate(){
 System.out.println(0.5*(l+b+h));
}
}
class rectangleA extends Data{
int l;
int b;
@Override
 void collect(int x,int y){
l=x;
b=y;
}

void calculate(){
 System.out.println(l*b);
}
}



class start{
	public static void main(String[] args){
		circleA c=new circleA();
		c.collect(5,3);
		c.calculate();
		triangleA t=new triangleA();
		t.collect(3,6);
		t.calculate();
		rectangleA r=new rectangleA();
		r.collect(5,6);
		r.calculate();

}
}
