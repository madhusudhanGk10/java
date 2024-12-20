class Vegitables{
	private String name;
	private String color;
	private int cost;
	private int size;
				Vegitables (String name, String color,int cost, int size) {
				name=name;
				color=color;
				cost=cost;
				size=size;
				}				// add getters
				public String getName()
				{
				return name;
				}
				public String getcolor() {
					return color;}
				public int getcost() {
					return cost;}
				public int getsize(){
					return size;
				}
		}
class Shadow{
		public static void main(String[] args) {
		Vegitables veg=new Vegitables("Tomato", "Red", 10,5);
		System.out.println(veg.getName());
		System.out.println(veg.getcolor());
		System.out.println(veg.getcost());
		System.out.println(veg.getsize());
}
}