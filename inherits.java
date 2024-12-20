class father{
void show(){
 System.out.println("father class");
}
}
class child extends father{
void dis(){
 System.out.println("child class");
}
}
class start{
	public static void main(String[] args){
		child c=new child();
		c.dis();
		c.show();
}
}