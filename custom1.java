class myexception extends throwable{
public MyException(String s)
	{
		super(s);
	}
}
class exception extends Exception{
	public exception(String s)
	{
	super(s);
	}
}
public class custom1{
	public static void main(String[] args) {
	try{
	throw new MyException("Exception from class MyException"); 
	throw new exception("Exception from class exception");
	}
	 catch(MyException ex) {
	 System.out.println("Exception caught"); 
	System.out.println(ex.getMessage()); 
	}
	catch(exception ex1) {
	 System.out.println("Exception caught"); 
	System.out.println(ex1.getMessage()); 
	}
	}
}