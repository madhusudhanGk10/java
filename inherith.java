class A{
void play(){
 System.out.println("A is playing");
}
}
class B extends A{
void run(){
 System.out.println("B is running");
}
}
class C extends A{
void eat(){
 System.out.println("C is eating");
}
}

class start{
	public static void main(String[] args){
		C c=new C();
		B b=new B();
		b.play();
		b.run();
		c.play();
		c.eat();
}
}
