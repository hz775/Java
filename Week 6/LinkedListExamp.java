import java.util.List;
import java.util.LinkedList;
public class LinkedListExamp{
	public static void main(String[] args){
		LinkedList<String> animal=new LinkedList<>();
		animal.add("Dog");
		animal.add("Lion");
		animal.add("Tiger");
		animal.remove("Dog");
		System.out.println("List: "+animal);
		animal.addLast("Elephant");
		animal.addFirst("Bear");
		System.out.println("List: "+animal.getFirst());
		System.out.println("List: "+animal.getLast());
		System.out.println("List: "+animal);
	}
}

		