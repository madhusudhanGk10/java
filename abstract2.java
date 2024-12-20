abstract class circleA {
abstract void calculate();
}
abstract class triangleA {
abstract void calculate();
}
abstract class rectangleA {
abstract void calculate();
}



class start{
	public static void main(String[] args){
		int l=5,b=6,re=7,h=4;
		final double pi=3.14;
		circleA c=new circleA(){
		 void calculate(){
		System.out.println(re*re*pi);
}
};
		
		triangleA t=new triangleA(){
		 void calculate(){
		System.out.println(0.5*(l+b+h));
}
};

		rectangleA r=new rectangleA(){
		 void calculate(){
		System.out.println(l*b);
}
};
c.calculate();
t.calculate();
r.calculate();

}
}
