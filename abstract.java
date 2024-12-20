abstract class A{
void play();
}
class B extends A{
void run(){
 System.out.println("B is running");
}
void play(){
 System.out.println("A is playing");
}
}

class start{
	public static void main(String[] args){
		C c=new C();
		B b=new B();
		b.play();
		b.run();
}
}
