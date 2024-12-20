public class overload {
	void add(int i,int j){
		System.out.println(i+j);
	}
	void add(int i) {
		System.out.println(2+i);
	}
}
class Overload1{
	public static void main(String[] args) {
		overload v=new overload();
		int a=10;
		int b= 15;
		v.add(a);
		v.add(a,b);
	}

}
