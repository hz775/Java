import java.util.HashSet;
import java.util.Set;

public class HashSetExamp{
	public static void main(String[] args){
		HashSet<String> color=new HashSet<>();
		color.add("Green");
		color.add("Blue");
		color.add("Yellow");
		System.out.print("Green color contains?: "+color.contains("Green"));
		color.remove("Yellow");
		System.out.println("Colors: "+color);
		
	}
}
