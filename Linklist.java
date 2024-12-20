import java.util.LinkedList;
public class Linklist {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();

		l1.add(50);

		l1.add("ineuron");

		System.out.println(l1);

		l1.addFirst("Hello");

		l1.add(3,99);

		l1.addLast("Bangalore");

		System.out.println(l1);

	}

}
