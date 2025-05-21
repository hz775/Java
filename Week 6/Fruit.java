import java.util.ArrayList;
import java.util.List;
public class Fruit{
	public static void main(String[] args){
		List<String> Fruits=new ArrayList<>();
		Fruits.add("Orange");
		Fruits.add("GreenApple");
		Fruits.add("Apple");
		Fruits.add("Goa");
		System.out.println("Fruits: "+Fruits);
		System.out.println("Fruits: "+Fruits.get(2));
		Fruits.remove("Apple");
		System.out.println("Fruits: "+Fruits);
	}
}
		