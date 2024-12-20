class parent{
parent(){
super();
System.out.println("inside the perent class");
}
}
class child extends parent{
child(){
System.out.println("inside the child class");
}
}
class Inherit1{
	public static void main(String[] args){
		child c=new child();
}
}

