class dog{
	void does(){
		System.out.println("BOW-BOW");
	}
}
class cat{
	void does(){
		System.out.println("meoW-meoW");
	}
}
class cow{
	void does(){
		System.out.println("amba-amba");
	}
}
class simpleobj{
	public static void main(String[] args){
		dog d1=new dog();
		cat c1=new cat();
		cow c2=new cow();
		d1.does();
		c1.does();
		c2.does();

	}
}