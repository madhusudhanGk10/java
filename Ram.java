class manishi{
	String name;
	int age;
	void eat(){
	  	System.out.println("he is eating");
	}
       void sleep(){
		System.out.println("he is sleeping");
	}
	void walk(){
		System.out.println("he is walking");
	}
	void bark(){
		System.out.println("he is barking");
	}
	void cry(){
		System.out.println("he is crying");
	}
}
class Ram{
	public static void main(String[] args){
		manishi ramana= new manishi();
		manishi reddy= new manishi();
		manishi madhu= new manishi();
		ramana.eat();
		ramana.sleep();
                ramana.walk();
		ramana.name="NRvenkataramana";
		ramana.age=20;
		System.out.println(ramana.name);
		System.out.println(ramana.age);
		
  }
}