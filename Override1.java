class human{
	void eat(){
		System.out.println("this the property 0f them");
	}
}
class man extends human{
	@Override
	void eat(){
	}
}
class women extends man{
	@Override
	void eat(){
	}
}
class Override1{
	public static void main(String[] args) {
	human h=new human();
	man m=new man();
	women w=new women();
	//h.eat();
	m.eat();
	w.eat();
}
}

