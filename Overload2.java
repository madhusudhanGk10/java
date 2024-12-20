class Overload2{
		static void add(int i,int j){
			System.out.println(i+j);
		}
		static void add(int i) {
			System.out.println(2+i);
		}
	public static void main(String[] args) {
		int a=10;
		int b= 15;
		add(a);
		add(a,b);
	}

}
