class sample
{
	public static void main(String[] args) 
	{
		//System.out.println("hello world!");
		Dog d=new Dog();
		d.run();
		d.cry();
		d.sleep();
		d.bark();
		d.name="puppy";
		d.age=5;
		d.colour="black";
		d.cost=6000;
		d.beard="pug";
		System.out.println(d.name +"\n"+d.colour+"\n"+d.beard);
		System.out.println(d.age+"\n"+d.cost);
	}
}