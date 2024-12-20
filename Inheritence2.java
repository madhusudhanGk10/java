class Parent{
void eat(){ 
System.out.println("Parent Eats");
} 
void sleep(){
 System.out.println("Parent sleeps");

}
void run(){ 
System.out.println("Parent runs 5km");
}
}
class Child extends Parent
{ 
 void sleep(){
 System.out.println("child sleeps");
} 
void swims() { 
System.out.println("child swims");
}
}
class Inheritence2{
	public static void main(String[] args){
		Child c=new Child();
		c.eat();
		c.sleep();
		c.run();
		c.swims();
}
}
